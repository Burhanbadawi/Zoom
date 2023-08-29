package birds;

import Aboutanimal.Animal;
import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Birds extends Animal  {
	
	
public final void truth() {
	System.out.println("All birds have wings");
}

public static void displayAllInformation(Animal animals) {

System.out.println("Name: " + animals.getName());
System.out.println("Age: " + animals.getAge());
speed(animals.getSpeed());

System.out.print("The "+animals.getName()+" feed: "); ((Feed) animals).feedit();
((Enviroments)animals).envi();
((Enviroments)animals).content();
((Enviroments)animals).weather();
((Movment)animals).movment();
animals.truth();
}

public void setSpeed(int speed) {
this.speed = speed;


}

	
	




}



 