package com.mkyong.common.conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConf {

	public static void main() {
		
		System.out.println("TestConf main()");
		
		/** Load config call**/
	/*	ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(HelloWorldConfig.class);
				   
				   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

				   helloWorld.setMessage("Hello World!");
				   helloWorld.getMessage();
				   */
		
		
		/** Load multiple config call**/
		
		   AnnotationConfigApplicationContext ctx = 
		   new AnnotationConfigApplicationContext();

		   ctx.register(AppConfig.class, OtherConfig.class);
		   ctx.register(AdditionalConfig.class);
		   ctx.refresh();

		   MyService myService = ctx.getBean(MyService.class);
		   myService.doStuff();
		}
}
