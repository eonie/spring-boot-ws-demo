package net.parim.ws.example;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import net.parim.ws.example.wsdl.Country;
import net.parim.ws.example.wsdl.GetCountryRequest;
import net.parim.ws.example.wsdl.GetCountryResponse;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.dexcoder.com/ws";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country poland = new Country();
        poland.setName("Poland-" + request.getName());
        poland.setCapital("Warsaw");
        poland.setCurrency(net.parim.ws.example.wsdl.Currency.PLN);
        poland.setPopulation(38186860);
        response.setCountry(poland);
        return response;
    }
}
