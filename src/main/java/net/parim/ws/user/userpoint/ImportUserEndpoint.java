package net.parim.ws.user.userpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import net.parim.ws.user.wsdl.ImportUserRequest;
import net.parim.ws.user.wsdl.ImportUserResponse;


@Endpoint
public class ImportUserEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8088/ImportUser";
    
    private static final Logger log = LoggerFactory.getLogger(ImportUserEndpoint.class);


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ImportUserRequest")
    @ResponsePayload
    public ImportUserResponse process(@RequestPayload ImportUserRequest request) {
    	ImportUserResponse response = null;
        response = handle(request);
        log.info(response.getSERVICEFLAG());
        return response;
    }


	private ImportUserResponse handle(ImportUserRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
}
