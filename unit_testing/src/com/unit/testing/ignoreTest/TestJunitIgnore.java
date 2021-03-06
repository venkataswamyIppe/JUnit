package com.unit.testing.ignoreTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunitIgnore {

	String message = "Robert";
	MessageUtilIgnore messageUtil = new MessageUtilIgnore(message);

	@Ignore
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Robert";
		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
