package com.demoTest.junitTest;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockitoDemo {
	@Mock
	MyUnit unitDemo;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void testDemo(){
		when(unitDemo.adding(1, 2)).thenReturn(5);
		
	}

}
