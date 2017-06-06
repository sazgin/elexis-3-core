package ch.elexis.core.data.interfaces;

import java.util.Map;

import ch.elexis.core.model.IPersistentObject;
import ch.elexis.data.Konsultation;
import ch.elexis.data.Kontakt;
import ch.elexis.data.Patient;
import ch.rgw.tools.TimeTool;

public interface IFall extends IPersistentObject {
	
	public String getAbrechnungsSystem();
	
	public String getInfoString(String kostentraeger);
	
	public void setRequiredContact(String kostentraeger, Kontakt k);
	
	public void setRequiredString(String versicherungsnummer, String vnOld);
	
	public Patient getPatient();
	
	public void setInfoString(String rechnungsempfaenger, String string);
	
	public Konsultation[] getBehandlungen(boolean b);
	
	public void setAbrechnungsSystem(String item);
	
	public void setGrund(String string);
	
	public void setBeginnDatum(String string);
	
	public void setEndDatum(String string);
	
	public void setBillingDate(TimeTool nDate);
	
	public void setCopyForPatient(boolean b);
	
	public void setGarant(Kontakt sel);
	
	public String getBezeichnung();
	
	public String getGrund();
	
	public String getBeginnDatum();
	
	public String getEndDatum();
	
	public boolean getCopyForPatient();
	
	public Kontakt getGarant();
	
	public String getRequirements();
	
	public String getOptionals();
	
	public String getUnused();
	
	public Map getMap(String fldExtinfo);
	
	public TimeTool getBillingDate();
	
	public void setMap(String string, Map<Object, Object> ht);
	
}
