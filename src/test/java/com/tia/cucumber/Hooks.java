package com.tia.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	@After
	public void close() {
		System.out.println("After Test");
	}
}
