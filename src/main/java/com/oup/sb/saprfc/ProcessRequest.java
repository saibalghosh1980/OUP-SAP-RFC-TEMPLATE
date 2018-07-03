package com.oup.sb.saprfc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;

public class ProcessRequest implements Processor {

	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext()
				.getEndpoint("sap-srfc-destination:quickstartDest:ZSPS_GET_SERIAL_NUMBER", SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();
		request.put("I_FILEPARAM", "AB01");
		exchange.getIn().setBody(request);
		
	}

}
