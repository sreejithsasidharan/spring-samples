package com.mkyong.common.conf;

import org.springframework.context.annotation.Bean;

public class AdditionalConfig {

	@Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
}
