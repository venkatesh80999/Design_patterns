package com.venky.CommandPattern;

public class LightOffCmd implements Command{

	  Light light;
	  public LightOffCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOff();
	    System.out.println("Lights are off!");
	  }
}
