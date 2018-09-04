package com.demoTest.junitTest;

public class MyUnit {
	 public String concatenate(String one, String two){
	        return one + two;
	    }
	 
	 public int adding(int j,int k){
		 return j+k;
		 
	 }
	 
	 public void testString(){
		 String test="one";
		 String test2="one";
		 String test1=new String("one");
		 if(test1==test){
		 System.out.println("double equals test for String-->true");

		 }else{
		 System.out.println("double equals is-->false");
		 }
		 System.out.println(".equal test for class object-->"+test.equals(test));
		 if(test1==test2){
			 System.out.println("---true");

			 }else{
			 System.out.println("-->false");
			 }
		 }
	 
	 public static void main(String[] args) {
		MyUnit unit=new MyUnit();
		MyUnit unit2=new MyUnit();
		unit.testString();
		if(unit==unit2){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}


}
