package ch.elexis.core.ui.importer.div.importers.multifile.strategy;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import ch.elexis.core.importer.div.importers.HL7Parser;
import ch.elexis.core.importer.div.importers.multifile.IMultiFileParser;
import ch.elexis.core.importer.div.importers.multifile.strategy.IFileImportStrategy;
import ch.elexis.core.ui.importer.div.importers.DefaultHL7Parser;
import ch.elexis.data.LabOrder;
import ch.elexis.data.LabResult;
import ch.rgw.tools.Result;
import ch.rgw.tools.TimeTool;

/**
 * Imports HL7Files using the {@link HL7Parser} and populates the context with the following
 * information: <br>
 * {@link IMultiFileParser#CTX_PATIENT Patient}, {@link IMultiFileParser#CTX_LABID LabId},
 * {@link IMultiFileParser#CTX_GROUP Group}, {@link IMultiFileParser#CTX_PRIO Prio},
 * {@link IMultiFileParser#CTX_TIME Time}
 * 
 * @author lucia
 * 		
 */
public class DefaultHL7ImportStrategy implements IFileImportStrategy {
	
	private HL7Parser hl7Parser;
	private boolean testMode;
	
	public static final String CFG_IMPORT_ENCDATA = "hl7Parser/importencdata";
	
	@SuppressWarnings("unchecked")
	@Override
	public Result<Object> execute(File file, Map<String, Object> context) throws IOException{
		String myLab = (String) context.get(IMultiFileParser.CTX_LABNAME);
		hl7Parser = new DefaultHL7Parser(myLab);
		Result<Object> result = null;
		
		if (testMode) {
			// we need to enable patient creation when testing otherwise test will fail
			result = (Result<Object>) hl7Parser.importFile(file.getAbsolutePath(), true);
		} else {
			result = (Result<Object>) hl7Parser.importFile(file.getAbsolutePath(), false);
		}
		
		Object resultObj = result.get();
		if (resultObj instanceof String) {
			List<LabOrder> orders = LabOrder.getLabOrdersByOrderId((String) resultObj);
			if (orders != null && !orders.isEmpty()) {
				LabOrder order = orders.get(0);
				context.put(IMultiFileParser.CTX_PATIENT, order.getPatient());
				context.put(IMultiFileParser.CTX_LABID, order.getLabResult().getOrigin().getId());
				context.put(IMultiFileParser.CTX_GROUP, order.getLabItem().getGroup());
				context.put(IMultiFileParser.CTX_PRIO, order.getLabItem().getPrio());
				context.put(IMultiFileParser.CTX_TIME, getDate(order.getLabResult()));
			}
		}
		return result;
	}
	
	private TimeTool getDate(LabResult result){
		TimeTool observationTime = result.getObservationTime();
		if (observationTime == null) {
			return new TimeTool(result.getDate());
		}
		return observationTime;
	}
	
	@Override
	public void setTestMode(boolean testing){
		this.testMode = testing;
	}
}
