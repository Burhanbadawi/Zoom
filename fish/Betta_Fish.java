package fish;

import Interface.Enviroments;
import Interface.Feed;

public class Betta_Fish extends Fish implements Feed,Enviroments {
	public Betta_Fish() {
		setName("Betta Fish");
		setAge(" Around 2 to 3 years (up to 4 or 5 years with proper care)");
	
		
	}

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
}
