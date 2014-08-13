package com.redhat.demo.deceval2.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.redhat.demo.deceval2.Constantes;
import com.redhat.demo.deceval2.Store;

public class ProcessorAlmacenaPayload implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(ProcessorAlmacenaPayload.class);
	
	@Autowired
	private Store store;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		/*
		//store.saveObject(Constantes.VARIABLE_IN_PAYLOAD, exchange.getIn());
		String fileContents = exchange.getIn().getBody(String.class);
		long timestamp = new Date().getTime();
		String fileName = "" + timestamp + new Random(timestamp).nextInt(10000) + ".txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		fos.write(fileContents.getBytes());
		fos.close();
		
		store.saveObject(Constantes.VARIABLE_FILENAME_PAYLOAD, fileName);
		log.info("Almacena payload: fileName = " + fileName);
		log.info("Almacena payload: fileContents =\n " + fileContents);
		*/
		
		store.saveObject(Constantes.VARIABLE_IN_PAYLOAD, exchange.getIn().getBody(String.class));
		log.info("Almacena payload: fileContents =\n " + exchange.getIn().getBody(String.class));
	}

}
