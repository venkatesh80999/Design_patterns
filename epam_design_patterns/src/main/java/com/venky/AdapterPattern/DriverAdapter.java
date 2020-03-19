package com.venky.AdapterPattern;

public class DriverAdapter {
	public DriverAdapter() {
		System.out.println();
		System.out.println("Adapter Pattern");
		Sparrow sparrow = new Sparrow(); 
	    ToyDuck toyDuck = new PlasticToyDuck(); 
	    ToyDuck birdAdapter = new BirdAdapter(sparrow); 
	    System.out.println("ToyDuck..."); 
	    toyDuck.squeak(); 
	    System.out.println("BirdAdapter..."); 
	    birdAdapter.squeak(); 
	    System.out.println("Sparrow..."); 
	    sparrow.fly(); 
	    sparrow.makeSound(); 
	}
}
