package birds;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public  class Sparrwo extends Birds implements Feed,Enviroments,Movment{


	@Override
	public void feedit() {
		System.out.println("Sparrows primarily eat a diet of seeds and grains");
		
	}

	@Override
	public void envi() {
		System.out.println("sparrows are found in urban and rural environments across the globe");
		
	}

	@Override
	public void weather() {
		System.out.println("The best weather for them is moderate temperatures");
		
	}

	@Override
	public void content() {
		System.out.println(" Sparrows are found throughout Europe");
		
		
	}

	@Override
	public void movment() {
	System.out.println("The" +getName()+"Fly");
		
	}
}
 
