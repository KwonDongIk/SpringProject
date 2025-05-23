package com.scan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("contextAnnotation.xml");
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		BoardController controller = ctx.getBean(BoardController.class);
		controller.insert();
	}

}
