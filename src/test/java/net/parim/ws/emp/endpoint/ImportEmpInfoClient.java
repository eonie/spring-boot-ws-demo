package net.parim.ws.emp.endpoint;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import net.parim.ws.user.wsdl.MsgHeader;
import net.parim.ws.user.wsdl.ObjectFactory;
import net.parim.ws.user.wsdl.ImportUserInputCollection;
import net.parim.ws.user.wsdl.ImportUserRequest;
import net.parim.ws.user.wsdl.ImportUserResponse;

@Component
public class ImportEmpInfoClient {

	public ImportUserResponse process(ImportUserInputCollection collection) throws DatatypeConfigurationException {
		ImportUserRequest request = new ObjectFactory().createImportUserRequest();
		MsgHeader msgHeader = new ObjectFactory().createMsgHeader();

		request.setMsgHeader(msgHeader);
		
		
//		ImportUserInputCollection collection = new ObjectFactory().createImportUserInputCollection();
//		
//
//		collection.getImportUserInputItem().add(empInfo);

		request.setImportUserInputCollection(collection);
		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setCheckForXmlRootElement(false);
		marshaller.setContextPath("net.parim.ws.user.wsdl");
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
	    webServiceTemplate.setMarshaller(marshaller);
	    webServiceTemplate.setUnmarshaller(marshaller);
	    webServiceTemplate.setDefaultUri("http://localhost:8088/ws/services/ImportUser");
		
	    ImportUserResponse response =  (ImportUserResponse)webServiceTemplate.marshalSendAndReceive(request);
	    return response;
		
	}
}
