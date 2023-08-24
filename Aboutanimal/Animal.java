package Aboutanimal;

import Interface.Enviroments;
import Interface.Feed;


public class Animal {

	public static  String name;
	public  String age;
	
	


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
	
	
	 public static void Swim  (int speed) {
		  System.out.println("In the Water the"+getName()+"swimming Speed: " + speed + " Km/h");
	    }
	  public static void Speed(int speed) {
	        System.out.println("Running Speed: " + speed + " Km/h");
	       
	    }

	    public  void Speed(int runningSpeed, String  swimmingSpeed) {
	        System.out.println("Running Speed: " + runningSpeed + " Km/h");
	        System.out.println("In the Water the"+getName()+"swimming Speed: " + swimmingSpeed + " Km/h");
	    }
	    
	    
	    public void truth() {
	        if (getName().equals("lion") || getName().equals("cow") || getName().equals("sheep")) {
	            System.out.println(getName() + " have mammary glands");
	        }
	        
	    }
	public static void displayAllInformation(Animal animals) {
	    
	    System.out.println("Name: " + animals.getName());
	    System.out.println("Age: " + animals.getAge());
	    Speed(0);
	    Swim(0);
	    
	    ((Feed) animals).feedit();
	    ((Enviroments)animals).envi();
	    ((Enviroments)animals).content();
	    ((Enviroments)animals).weather();;
	    animals.truth();
	}

	
}

