package com.venky.epam_design_patterns;
import com.venky.TemplatePattern.*;
import com.venky.SingletonPattern.*;
import com.venky.AdapterPattern.*;
import com.venky.CommandPattern.*;
import com.venky.PrototypePattern.*;
import com.venky.BridgePattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}
