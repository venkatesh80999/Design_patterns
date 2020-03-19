package com.venky.CommandPattern;

public class DriverCommand {
	public DriverCommand(){
		System.out.println();
		System.out.println("Command Pattern");
		RemoteControl control = new RemoteControl();
	    Light light = new Light();
	    Command lightsOn = new LightOnCmd(light);
	    Command lightsOff = new LightOffCmd(light);
	    control.setCommand(lightsOn);
	    control.pressButton();
	    control.setCommand(lightsOff);
	    control.pressButton();
	}
}
