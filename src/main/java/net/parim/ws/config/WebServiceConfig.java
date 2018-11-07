package net.parim.ws.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.soap.server.SoapMessageDispatcher;
import org.springframework.ws.transport.WebServiceMessageReceiver;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean(name = "messageDispatcherServlet")
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/services/*");
	}
	@Bean(name = "messageReceiver")
	public WebServiceMessageReceiver messageReceiver() {
		SoapMessageDispatcher soapMessageDispatcher = new SoapMessageDispatcher();
		return soapMessageDispatcher;
	}
	@Bean(name = "messageFactory")
	public WebServiceMessageFactory messageFactory() {
		WebServiceMessageFactory soapMessageFactory = new SaajSoapMessageFactory();
		return soapMessageFactory;
	}

	@Bean(name = "ImportUser")
	public SimpleWsdl11Definition importEmpInfoWsdl11Definition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition(new ClassPathResource("ws/user/ImportUser.wsdl"));
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema SB_EIP_EIP_ImportEmpInfoSrvSchema() {
	  return new SimpleXsdSchema(new ClassPathResource("ws/user/ImportUserSchema.xsd"));
	}
	@Bean
	public XsdSchema MsgHeader() {
		return new SimpleXsdSchema(new ClassPathResource("ws/user/MsgHeader.xsd"));
	}
	
	@Bean(name = "countries")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("ws/example/countries.xsd"));
    }
}
