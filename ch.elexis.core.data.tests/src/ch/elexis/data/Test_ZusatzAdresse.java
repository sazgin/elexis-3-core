package ch.elexis.data;

import java.util.List;

import org.junit.Test;

import ch.elexis.core.exceptions.ElexisException;
import ch.elexis.core.types.AddressType;
import ch.elexis.data.dto.ZusatzAdresseDTO;
import ch.rgw.tools.JdbcLink;
import junit.framework.Assert;

public class Test_ZusatzAdresse extends AbstractPersistentObjectTest {
	
	public Test_ZusatzAdresse(JdbcLink link){
		super(link);
	}

	@Test(expected = ElexisException.class)
	public void TestZusatzAdresseWithoutKontakt() throws ElexisException{
		ZusatzAdresseDTO zusatzAdresseDTO = new ZusatzAdresseDTO();
		zusatzAdresseDTO.setAddressType(AddressType.ATTACHMENT_FIGURE);
		zusatzAdresseDTO.setCountry("A");
		zusatzAdresseDTO.setStreet1("Teststreet 1");
		zusatzAdresseDTO.setKontaktId("1");
		zusatzAdresseDTO.setZip("1010");
		zusatzAdresseDTO.setPlace("Vienna");
		zusatzAdresseDTO.setStreet2("Teststreet 2");
		zusatzAdresseDTO.setKontaktId(null);
		
		ZusatzAdresse zusatzAdresse = ZusatzAdresse.load(null);
		zusatzAdresse.persistDTO(zusatzAdresseDTO);
	}
	
	@Test
	public void TestZusatzAdresseWithKontakt() throws ElexisException{
		Patient patient = new Patient("Mustermann", "Max", "1.1.2000", "m");
		ZusatzAdresseDTO zusatzAdresseDTO = new ZusatzAdresseDTO();
		zusatzAdresseDTO.setAddressType(AddressType.ATTACHMENT_FIGURE);
		zusatzAdresseDTO.setCountry("A");
		zusatzAdresseDTO.setStreet1("Teststreet 1");
		zusatzAdresseDTO.setKontaktId("1");
		zusatzAdresseDTO.setZip("1010");
		zusatzAdresseDTO.setPlace("Vienna");
		zusatzAdresseDTO.setStreet2("Teststreet 2");
		zusatzAdresseDTO.setKontaktId(patient.getId());
		ZusatzAdresse zusatzAdresse = ZusatzAdresse.load(null);
		zusatzAdresse.persistDTO(zusatzAdresseDTO);
		
		List<ZusatzAdresse> zusatzAdressen = patient.getZusatzAdressen();
		Assert.assertTrue(zusatzAdressen.size() == 1);
		
		ZusatzAdresse savedZusatzAdresse = zusatzAdressen.get(0);
		
		Assert.assertEquals("Teststreet 1", savedZusatzAdresse.getDTO().getStreet1());
		Assert.assertEquals("Teststreet 1", savedZusatzAdresse.get(ZusatzAdresse.STREET1));
		Assert.assertEquals(savedZusatzAdresse.getId(), savedZusatzAdresse.getDTO().getId());
		Assert.assertEquals(savedZusatzAdresse.get(ZusatzAdresse.KONTAKT_ID),
			savedZusatzAdresse.getDTO().getKontaktId());
	}
}
