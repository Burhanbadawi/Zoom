package reptiles;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Chameleon extends Reptiles implements Feed,Enviroments,Movment{
	
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
	@Override
	public void movment() {
	System.out.println("The" +getName()+"walk/climb");
		
	}
}
