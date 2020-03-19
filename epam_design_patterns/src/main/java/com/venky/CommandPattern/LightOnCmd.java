package com.venky.CommandPattern;

public class LightOnCmd implements Command{
	
	  Light light;
	  public LightOnCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOn();
	    System.out.println("Lights are on!");
	  }
}
