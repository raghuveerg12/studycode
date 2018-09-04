package com.demoTest.junitTest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class CarTestDemo {
	
	@Mock
	EngineDemo engine;
	
	@InjectMocks
	CarDemo car;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testAccelarate(){
		when(engine.increaseRPM()).thenReturn(8000);
		car.accelerateEngine();
		assertEquals("SlowDown",car.getWarningMessage());
	}

}
