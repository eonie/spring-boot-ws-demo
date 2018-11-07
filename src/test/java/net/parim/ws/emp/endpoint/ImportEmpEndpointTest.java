package net.parim.ws.emp.endpoint;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import net.parim.ws.user.wsdl.ImportUserInputCollection;
import net.parim.ws.user.wsdl.ObjectFactory;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class ImportEmpEndpointTest {

	@Autowired
	ImportEmpInfoClient importEmpInfoClient;

	@Test
	public void testProcess() throws DatatypeConfigurationException {
		ImportUserInputCollection empInfo = new ObjectFactory()
				.createImportUserInputCollection();

		importEmpInfoClient.process(empInfo);
	}

}
