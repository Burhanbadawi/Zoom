package fish;

import Interface.Enviroments;
import Interface.Feed;

public class Salmon extends Fish  implements Feed,Enviroments {
	public Salmon() {
		setName("Salmon");
		setAge("Around 3 to 7 years.");
		
	}

	@Override
	public void feedit() {
	System.out.println("Small aquatic animals like insects, crustaceans, and smaller fish.");
		
	}

	@Override
	public void envi() {
		System.out.println("Salmon reside in oceans and rivers ");
		
	}

	@Override
	public void weather() {
		System.out.println("Salmon often prefer cooler water temperatures, especially during their spawning migration.");
		
		
	}

	@Override
	public void content() {
		System.out.println("Atlantic salmon (Salmo salar) are native to the North Atlantic Ocean");
	} 
}
