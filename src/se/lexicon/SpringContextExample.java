package se.lexicon;

import se.lexicon.config.ApplicationAnnotationConfig;
import se.lexicon.service.RandomNumberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextExample {

	public static void main(String[] args) {

		// XML-Config Example
		// In Eclipse, move application.xml to project root (src/com/squidfarms)
		// In IntelliJ, keep application.xml in src

//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		// Java-Config Example
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationJavaConfig.class);

		// Annotation Based Example
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationAnnotationConfig.class);


		RandomNumberService numberService = context.getBean("randomNumberService", RandomNumberService.class);
		System.out.println( "Random Number Generated As : " + numberService.getRandomNumber() );
	}

}
