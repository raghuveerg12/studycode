package com.demoTest.junitTest;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {
	
	MyUnit unit=new MyUnit();

@Test
public void testConcatenate() {
String result=unit.concatenate("one", "two");
assertEquals("onetwo", result);

}

@Test
public void testAdding(){
	int result=unit.adding(10, 20);
	assertEquals(30,result);
}
}
