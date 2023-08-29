package mammals;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Cow extends Mammals implements Feed,Enviroments,Movment{
	
	@Override
	public void feedit() {
		System.out.println("Cows are herbivores and mainly consume grasses and plant material.");
		
	}

	@Override
	public void envi() {
		System.out.println("Cows thrive in various global agricultural settings ");
		
	}

	@Override
	public void weather() {
		System.out.println("Cows are generally comfortable in temperatures ranging from around 40°F to 75°F (4.5°C to 24°C).");
		
	}

	@Override
	public void content() {
		System.out.println("Cattle are widespread across the United States, Canada, Mexico, and other North American countries. ");
		
	}

	@Override
	public void movment() {
	System.out.println("The" +getName()+"Walk");
		
	}
	
	
}

	
	

