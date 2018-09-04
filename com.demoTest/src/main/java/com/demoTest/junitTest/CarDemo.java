package com.demoTest.junitTest;

public class CarDemo {
	private EngineDemo engine;
	
	private String warningMessage;
	
	public CarDemo(EngineDemo engine){
		this.engine=engine;
	}
	
	public void accelerateEngine(){
		if(engine.increaseRPM() > 6000){
			warningMessage="SlowDown";
		}
		
		
	}
	public String getWarningMessage(){
		return warningMessage;
	}

	

}
