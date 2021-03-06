package org.eclectech.survey.test.data;

import java.net.UnknownHostException;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "org.eclectech.survey" })
@EnableAutoConfiguration
public class Application {
	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws UnknownHostException {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		logger.info("Test Data Loader");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			logger.info("beanName : {}", beanName);
		}
	}
}