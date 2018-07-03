package com.oup.sb.saprfc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.fusesource.camel.component.sap.model.rfc.Structure;

public class ProcessResponse implements Processor{

	public void process(Exchange exchange) throws Exception {
		Structure response = exchange.getIn().getBody(Structure.class);
		String number=response.get("E_PARAMVALUE", String.class);
		System.out.println("------------------->"+number);	
		
	}

}
