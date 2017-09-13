package com.training.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogger {

	/**
	 * 
	 * @author esaxsar
	 * @version 1.0
	 */
	private static final Logger slf4jLogger = LoggerFactory
			.getLogger(HelloLogger.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		slf4jLogger.trace("hello");
		slf4jLogger.debug("sample");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		String name = "Abhijit";
		slf4jLogger.debug("Hi, {}", name);
		slf4jLogger.info("Welcome to the HelloWorld example of Logback.");
		slf4jLogger.warn("Dummy warning message.");
		slf4jLogger.error("Dummy error message.");
	}
}
