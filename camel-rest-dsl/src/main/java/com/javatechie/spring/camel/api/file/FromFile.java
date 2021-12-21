package com.javatechie.spring.camel.api.file;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FromFile extends RouteBuilder{
	
	
	@Override
	public void configure() throws Exception {
		
		
		from("file:files?delay=5s&noop=true")
    		 .log("${body}");  // .log("Message ${id}") 
		
		
	}
	
}
