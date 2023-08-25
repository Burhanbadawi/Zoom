package human;

import Aboutanimal.Animal;
import Interface.Enviroments;
import Interface.Feed;
import mammals.Mammals;

public class Human extends Animal implements Feed,Enviroments {

	

	public Human() {
		setName("He can call himself whatever he wants");
		setAge(" many people now live well into their 80s, 90s, and even over 100 years");
	}

	
	



@Override
public void feedit() {
	System.out.println(" Humans are omnivores,which means they have the ability to consume both plant-based and animal-based foods");
	
}

@Override
public void envi() {
	System.out.println("The humans can lives anywhere");
	
}
@Override
public void weather() {
	System.out.println("Many people have favorite seasons. Some enjoy the warmth of summer, while others appreciate the crisp air of autumn, the coziness of winter, or the blossoms of spring.");
	
}
@Override
public void content() {
	System.out.println( "inhabit all continents on Earth.");
	
}


}


