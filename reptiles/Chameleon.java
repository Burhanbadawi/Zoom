package reptiles;

import Interface.Enviroments;
import Interface.Feed;

public class Chameleon extends Reptiles implements Feed,Enviroments{
	public Chameleon() {
		setName("Chameleon");
		setAge("Chameleons generally have a lifespan of around 2 to 3 years in the wild");
	}

	@Override
	public void feedit() {
		System.out.println("Chameleons primarily eat insects, such as crickets, grasshoppers, flies, and other small arthropods");
		
	}

	@Override
	public void envi() {
		System.out.println("chameleons live in trees and shrubs in tropical and subtropical regions");
		
	}

	@Override
	public void weather() {
		System.out.println( "Chameleon species found in tropical regions");
		
	}

	@Override
	public void content() {
		System.out.println( " Chameleons are widespread in various countries across Africa");
		
	}
}
