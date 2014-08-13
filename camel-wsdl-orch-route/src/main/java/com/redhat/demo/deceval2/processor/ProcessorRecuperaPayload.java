package com.redhat.demo.deceval2.processor;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.redhat.demo.deceval2.Constantes;
import com.redhat.demo.deceval2.Store;

public class ProcessorRecuperaPayload implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(ProcessorRecuperaPayload.class);
	
	@Autowired
	private Store store;

	@Override
	public void process(Exchange exchange) throws Exception {

		/*
		String filename = (String) store.loadObject(Constantes.VARIABLE_FILENAME_PAYLOAD);
		
		byte[] bytes = Files.readAllBytes(Paths.get(filename));
		String fileContents = new String(bytes, StandardCharsets.UTF_8);
				
		//exchange.getIn().setBody(fileContents, String.class);
		exchange.getOut().setBody(fileContents, String.class);
		log.info("Se recupero variable payload");
		//log.info( exchange.getIn().getBody(String.class) );
		log.info( exchange.getOut().getBody(String.class) );
		*/
		
		String bodyInOriginal = (String)store.loadObject(Constantes.VARIABLE_IN_PAYLOAD);

		if (bodyInOriginal == null)
		{
			log.debug("no se recupero variable payload [null]");
			return;
		}
		
		exchange.getIn().setBody(bodyInOriginal, String.class);
		log.info("Se recupero variable payload");
		log.debug( exchange.getIn().getBody(String.class) );	}

}
