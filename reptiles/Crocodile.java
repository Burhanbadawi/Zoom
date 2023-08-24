package reptiles;

import Interface.Enviroments;
import Interface.Feed;

public class Crocodile extends Reptiles implements Feed,Enviroments{
	public Crocodile() {
		setName("Crocodile");
		setAge("Crocodiles can live anywhere from 30 to 75 years on average");
	}

	@Override
	public void feedit() {
	System.out.println("Eat a diet consisting of fish, birds, mammals.");
		
	}

	@Override
	public void envi() {
		System.out.println( "Crocodiles are found in freshwater and brackish habitats");
		
	}

	@Override
	public void weather() {
		System.out.println( "Crocodiles are most active and thrive in warm, ");
		
	}

	@Override
	public void content() {
		System.out.println( "Crocodiles are found in various countries across Africa");
	}

	
}
