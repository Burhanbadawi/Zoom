package fish;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Betta_Fish extends Fish implements Feed,Enviroments,Movment {


	@Override
	public void feedit() {
	System.out.println("Insects, larvae, small aquatic invertebrates, and specially formulated betta pellets.");
		
	}

	@Override
	public void envi() {
		System.out.println("betta fish are native to slow-moving waters in Southeast Asia. ");
		
	}
	@Override
	public void weather() {
		 System.out.println(" Betta fish are most comfortable in water temperatures between 78°F to 80°F (25.5°C to 26.5°C).");
	}

	@Override
	public void content() {
		System.out.println("Betta fish are native to Thailand");
		
	}
	@Override
	public void movment() {
	System.out.println("The" +getName()+"Swim");
		
	}
}
