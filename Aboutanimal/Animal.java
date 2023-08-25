package Aboutanimal;

import Interface.Enviroments;
import Interface.Feed;
 


import birds.Birds;
import birds.Eagle;
import birds.Parrot;
import birds.Sparrwo;
import fish.Betta_Fish;
import fish.Clownfish;
import fish.Fish;
import fish.Salmon;
import human.Human;
import mammals.Cow;
import mammals.Lion;
import mammals.Mammals;
import mammals.Sheep;
import reptiles.Chameleon;
import reptiles.Crocodile;
import reptiles.Reptiles;

public class Animal {

	public static  String name;
	public  String age;
	private static int speed;
	
	


	public static  String getName() {
		return name;
	}
	public void setName(String name) {
		Animal.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	

	 
	    
	    public void truth() {
	        if (getName().equals("Lion") || getName().equals("Cow") || getName().equals("Sheep")) {
	            System.out.println(getName() + " have mammary glands");
	        }
	        if (getName().equals("Salmon") || getName().equals("Clownfish") || getName().equals("Betta Fish")) {
	            System.out.println(getName() + " lives in water");
	        }
	        if (getName().equals("Eagle") || getName().equals("Parrot") || getName().equals("Sparrwo")) {
	            System.out.println(getName() + " have a wings");
	        }
	        if (getName().equals("Chameleon") || getName().equals("Crocodile") || getName().equals("Turtle")) {
	            System.out.println(getName() + " the skin covers scales");
	        }
	        if (getName().equals("He can call himself whatever he wants")) {
	        	
	            System.out.println( "Humans uniquely communicate through language, enabling them to share ideas, emotions, and knowledge across cultures and generations.");
	        }
	        
	    }
	    public   void Speed() {
	    	 this.speed = speed;
		        Speed();
	       
	    }

	    public  static void Speed(int speed) {
	    	 System.out.println("Running Speed: " + speed + " Km/h");
	    }
	
	    public  static void Speed(int runningSpeed, String  swimmingSpeed) {
	        System.out.println("Running Speed: " + runningSpeed + " Km/h");
	        System.out.println("In the Water the"+getName()+"swimming Speed: " + swimmingSpeed + " Km/h");
	    }
	    
	public static void displayAllInformation(Animal animals) {
	    
	    System.out.println("Name: " + Animal.getName());
	    System.out.println("Age: " + animals.getAge());
	  animals.Speed();
     
	    ((Feed) animals).feedit();
	    ((Enviroments)animals).envi();
	    ((Enviroments)animals).content();
	    ((Enviroments)animals).weather();;
	    animals.truth();
	}
	

	
}

