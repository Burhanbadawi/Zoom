package Aboutanimal;



import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;
public class Animal {

	private  String name;
	private  String age;
	protected int speed;

	
	
	
	
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed,String speed1) {
		this.speed = speed;
		this.speed(speed, speed1);
	}
	

	
	
	
	

	public   String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	   
	    
	    public static void speed(int runningSpeed) {
	        System.out.println("Running Speed: " + runningSpeed + " Km/h");
	        
	      
	    }

	    
	
	
	    public  void speed(int runningSpeed, String  swimmingSpeed) {
	    	
	    	
	    	
	        System.out.println("Running Speed: " + runningSpeed + " Km/h");
	        System.out.println("In the Water the"+"swimming Speed: " + swimmingSpeed );
	        
	      
	      
	    }
	    
	public static void displayAllInformation(Animal animals) {
	    
	    System.out.println("FINSHED");
	}

	

	



}
