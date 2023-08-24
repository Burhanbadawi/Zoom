package fish;

import Interface.Enviroments;
import Interface.Feed;

public class Clownfish extends Fish implements Feed,Enviroments{
	public Clownfish() {
		setName("Clownfish");
		setAge("Around 3 to 5 years");
		
	}

	@Override
	public void feedit() {
	System.out.println("Algae, plankton, small invertebrates, and food particles from sea anemones.");
		
	}

	@Override
	public void envi() {
		System.out.println("clownfish inhabit coral reefs in warm Pacific and Indian Ocean waters");
		
	}

	@Override
	public void weather() {
		System.out.println("Clownfish thrive in water temperatures ranging from 75°F to 80°F (24°C to 27°C).");
		
	}

	@Override
	public void content() {
		System.out.println("Clownfish can be found in various parts of the Indian Ocean");
		
	}
	 
}
