package reptiles;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Turtle extends Reptiles implements Feed,Enviroments,Movment{

	@Override
	public void feedit() {
		System.out.println("Turtles typically eat a diet that includes plants, insects, worms, small aquatic animals, and occasionally, depending on the species, small vertebrates.");
		
	}

	@Override
	public void envi() {
		System.out.println(" turtles inhabit various aquatic environments including oceans, lakes, and rivers");
		
	}

	@Override
	public void weather() {
		System.out.println( "many prefer warm and temperate climates, while others thrive in tropical or aquatic habitats.");
		
	}

	@Override
	public void content() {
		System.out.println( "Turtles inhabit a range of environments in North America");
		
	}
	@Override
	public void movment() {
	System.out.println("The" +getName()+"walk/swim");
		
	}
}