package birds;

import Interface.Enviroments;
import Interface.Feed;

public class  Parrot extends Birds implements Feed,Enviroments{
	 public  Parrot() {
		 setName(" Parrot");
		 setAge("around 15 to 80 years depending on the species.");
	 }

	@Override
	public void feedit() {
		System.out.println("Parrots typically eat a diet of fruits, nuts, seeds, and occasionally insects");
		
	}

	@Override
	public void envi() {
	System.out.println("parrots inhabit tropical and subtropical forests in regions like Central and South America, Africa, Asia, and Australia.");
		
	}

	@Override
	public void weather() {
		System.out.println("they generally prefer moderate temperaturestemperature range between 70°F to 80°F (21°C to 27°C) is considered comfortable. ");
		
	}

	@Override
	public void content() {
		System.out.println("South America, Africa, Asia, and Australia");
		
	}
}
