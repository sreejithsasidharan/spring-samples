package com.mkyong.common.conf;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean 
	   public MyService myTestService(){
	      return new MyService();
	   }

}
