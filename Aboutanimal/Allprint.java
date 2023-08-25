package Aboutanimal;

import java.util.Scanner;

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
import reptiles.Turtle;

public class Allprint extends Animal {

	private Scanner scanner;

	public Allprint(Scanner scanner) {
		this.scanner = scanner;
	}

	public void animals() {
		while (true) {
			System.out.println("Choose the type of animal species you want to know about");
			System.out.println("1. Mammals");
			System.out.println("2. Fish");
			System.out.println("3. Human");
			System.out.println("4. Birds");
			System.out.println("5. Reptiles");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				chooseMammal();
				break;
			case 2:
				chooseFish();
				break;
			case 3:
				chooseHuman();
			case 4:
				chooseBirds();
			case 5:
				chooseReptils();
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	private void chooseMammal() {
		while (true) {
			System.out.println("Select the Animal  ");
			System.out.println("1. Lion");
			System.out.println("2.Cow");
			System.out.println("3. Sheep");
			int MammalTypeChoice = scanner.nextInt();
			scanner.nextLine();
			switch (MammalTypeChoice) {
			case 1:
				Lion lion = new Lion();
				lion.getName();
				System.out.println("You've selected Lion.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Lion = scanner.nextLine();

				switch (Lion) {
				case "name":
					System.out.println("Name: " + lion.getName(	));
					break;
				case "age":
					System.out.println("Age: " + lion.getAge());
					break;
				case "speed":
					System.out.print("The spped of"+lion.getName());
					lion.Speed(20);
					break;
				case "feed":
					lion.feedit();
					break;
				case "info":
					System.out.println("About lion");
					mammals.Lion.displayAllInformation(lion);
				case "env":
					lion.envi();
					break;
				case "truth":
					lion.truth();
					break;
				case "weather":
					lion.weather();
					break;
				case "content":
					lion.content();
				break;
				
				default:
					
					System.out.println("Invalid attribute choice");
					break;
				}
				break;

			case 2:
				Cow cow = new Cow();
				System.out.println("You've selected Cow.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Cow = scanner.nextLine();

				switch (Cow) {
				case "name":
					System.out.println("Name: " + cow.getName());
					break;
				case "age":
					System.out.println("Age: " + cow.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					cow.Speed(20);
					break;
				case "feed":
					cow.feedit();
					break;
				case "info":
					System.out.println("About Cow");
					cow.displayAllInformation(cow);
					break;
				case "envi":
					cow.envi();
					break;
				case"weather":
					cow.weather();
					break;
				case"content":
					cow.content();
                    break;
				case "truth":
					cow.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			case 3:
				Sheep sheep=new Sheep();
				System.out.println("You've selected Parrot.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Sheep = scanner.nextLine();

				switch (Sheep) {
				case "name":
					System.out.println("Name: " + sheep.getName());
					break;
				case "age":
					System.out.println("Age: " + sheep.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					sheep.Speed(3);
					break;
				case "feed":
					sheep.feedit();
					break;
				case "info":
					System.out.println("About Sheep");
					sheep.displayAllInformation(sheep);
					break;
				case "envi":
					sheep.envi();
					break;
				case "weather":
					sheep.weather();
					break;
				case "content":
				sheep.content();
				break;
				case "truth":
					sheep.truth();
					break;
			
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;

			}

			System.out.println("Do you want to choose another mammal? (yes/no)");
			String continueChoice = scanner.nextLine();
			if (!continueChoice.equalsIgnoreCase("yes")) {
				break;
			}
		}

	}

	private void chooseFish() {
		while (true) {
			System.out.println("Select the Fish  ");
			System.out.println("1. Salmon");
			System.out.println("2. Clownfish");
			System.out.println("3. Betta_Fish");
			int FishTypeChoice = scanner.nextInt();
			scanner.nextLine();

			switch (FishTypeChoice) {
			case 1:
				Salmon salmon=new Salmon();
				System.out.println("You've selected Salmon.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Salmon = scanner.nextLine();

				switch (Salmon) {
				case "name":
					System.out.println("Name: " + salmon.getName());
					break;
				case "age":
					System.out.println("Age: " + salmon.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					salmon.Speed(0);
					break;
				case "feed":
					salmon.feedit();
					break;
				case "info":
					System.out.println("About salmon");
					salmon.displayAllInformation(salmon);
					break;
				case "envi":
					salmon.envi();
					break;
				case "weather":
					salmon.weather();
					break;
				case "contant":
					salmon.content();
					break;
				case "truth":
					salmon.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			case 2:
				Clownfish clownfish=new Clownfish();
				System.out.println("You've selected Clownfish.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Clownfish = scanner.nextLine();

				switch (Clownfish) {
				case "name":
					System.out.println("Name: " + clownfish.getName());
					break;
				case "age":
					System.out.println("Age: " + clownfish.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					clownfish.Speed(0);
					break;
				case "feed":
					clownfish.feedit();
					break;
				case "info":
					System.out.println("About clownfish");
					clownfish.displayAllInformation(clownfish);
					break;
				case "envi":
					clownfish.envi();
					break;
				case "weather":
					clownfish.weather();
					break;
				case "contant":
					clownfish.content();
					break;
				case "truth":
					clownfish.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			case 3:
				Betta_Fish betta=new Betta_Fish();
				System.out.println("You've selected Betta_Fish.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Betta_Fish = scanner.nextLine();

				switch (Betta_Fish) {
				case "name":
					System.out.println("Name: " + betta.getName());
					break;
				case "age":
					System.out.println("Age: " + betta.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					betta.Speed(0);
					break;
				case "feed":
					betta.feedit();
					break;
				case "info":
					System.out.println("About betta-fish");
					betta.displayAllInformation(betta);
					break;
				case "envi":
					betta.envi();
					break;
				case "weather":
				betta.weather();
					break;
				case "contant":
					betta.content();
					break;
				case "truth":
					betta.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to choose another Fish? (yes/no)");
			String continueChoice = scanner.nextLine();
			if (!continueChoice.equalsIgnoreCase("yes")) {
				break;
			}
		}
	}

	private void chooseBirds() {
		while (true) {
			System.out.println("Select the Birds  ");
			System.out.println("1. Eagle");
			System.out.println("2.Sparrow");
			System.out.println("3. Parrot");
			int BirdsTypeChoice = scanner.nextInt();
			scanner.nextLine();
			switch (BirdsTypeChoice) {
			case 1:
				Eagle eagle = new Eagle();
				System.out.println("You've selected Eagle.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Eagle = scanner.nextLine();

				switch (Eagle) {
				case "name":
					System.out.println("Name: " + eagle.getName());
					break;
				case "age":
					System.out.println("Age: " + eagle.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					eagle.Speed(320);
					break;
				case "feed":
					eagle.feedit();
					break;
				case "info":
					System.out.println("About Eagle");
					eagle.displayAllInformation(eagle);
					break;
				case "envi":
					eagle.envi();
					break;
				case "weather" :
					eagle.weather();
					break;
				case "contant":
					eagle.content();
					break;
				case "truth":
					eagle.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;

			case 2:
				Sparrwo sparrow = new Sparrwo();
				System.out.println("You've selected sparrow.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Sparrwo = scanner.nextLine();

				switch (Sparrwo) {
				case "name":
					System.out.println("Name: " + sparrow.getName());
					break;
				case "age":
					System.out.println("Age: " + sparrow.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					sparrow.Speed(20);
					break;
				case "feed":
					sparrow.feedit();
					break;
				case "info":
					System.out.println("About parrot");
					sparrow.displayAllInformation(sparrow);
					break;
				case "envi":
					sparrow.envi();
					break;
				case "weather" :
					sparrow.weather();
					break;
				case "contant":
					sparrow.content();
					break;
				case "truth":
					sparrow.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			case 3:
				Parrot parrot=new Parrot();
				System.out.println("You've selected Parrot.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Parrot = scanner.nextLine();

				switch (Parrot) {
				case "name":
					System.out.println("Name: " + parrot.getName());
					break;
				case "age":
					System.out.println("Age: " + parrot.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					parrot.Speed(100);
					break;
				case "feed":
					parrot.feedit();
					break;
				case "info":
					System.out.println("About parrot");
					parrot.displayAllInformation(parrot);
					break;
				case "envi":
					parrot.envi();
					break;
				case "weather":
					parrot.weather();
					break;
				case "contant":
					parrot.content();
					break;
				case "truth":
					parrot.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
			System.out.println("Do you want to choose another Fish? (yes/no)");
			String continueChoice = scanner.nextLine();
			if (!continueChoice.equalsIgnoreCase("yes")) {
				break;
		}
	
		}
	}

	private void chooseReptils() {
		while (true) {
			System.out.println("Select the Reptils  ");
			System.out.println("1. Crocodile");
			System.out.println("2.Chameleon");
			System.out.println("3. Turtle");
			int ReptilsTypeChoice = scanner.nextInt();
			scanner.nextLine();
			switch (ReptilsTypeChoice) {
			case 1:
				Crocodile crocodile = new Crocodile();
				System.out.println("You've selected Crocodile.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Crocodile = scanner.nextLine();

				switch (Crocodile) {
				case "name":
					System.out.println("Name: " + crocodile.getName());
					break;
				case "age":
					System.out.println("Age: " + crocodile.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					crocodile.Speed(50, null);
					break;
				case "feed":
					crocodile.feedit();
					break;
				case "info":
					System.out.println("About crocodile");
					crocodile.displayAllInformation(crocodile);
					break;
				case "envi":
					crocodile.envi();
					break;
				case "weather" :
					crocodile.weather();
					break;
				case "contant":
					crocodile.content();
					break;
				case "truth":
					crocodile.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;

			case 2:
				Chameleon chameleon = new Chameleon();
				System.out.println("You've selected Chameleon.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Chameleon = scanner.nextLine();

				switch (Chameleon) {
				case "name":
					System.out.println("Name: " + chameleon.getName());
					break;
				case "age":
					System.out.println("Age: " + chameleon.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					chameleon.Speed(20, null);
					break;
				case "feed":
					chameleon.feedit();
					break;
				case "info":
					System.out.println("About Chameleon");
					chameleon.displayAllInformation(chameleon);
					break;
				case "envi":
					chameleon.envi();
					break;
				case "weather" :
					chameleon.weather();
					break;
				case "contant":
					chameleon.content();
					break;
				case "truth":
					chameleon.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			case 3:
				Turtle turtle = new Turtle();
				System.out.println("You've selected Turtle.");
				System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");
				String Turtle = scanner.nextLine();

				switch (Turtle) {
				case "name":
					System.out.println("Name: " + turtle.getName());
					break;
				case "age":
					System.out.println("Age: " + turtle.getAge());
					break;
				case "speed":
					System.out.print("Speed: ");
					turtle.Speed(2,null);
					break;
				case "feed":
					turtle.feedit();
					break;
				case "info":
					System.out.println("About Turtle");
					turtle.displayAllInformation(turtle);
					break;
				case "envi":
					turtle.envi();
					break;
				case "weather" :
					turtle.weather();
					break;
				case "contant":
					turtle.content();
					break;
				case "truth":
					turtle.truth();
					break;
				default:
					System.out.println("Invalid attribute choice");
					break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
			System.out.println("Do you want to choose another Fish? (yes/no)");
			String continueChoice = scanner.nextLine();
			if (!continueChoice.equalsIgnoreCase("yes")) {
				break;
		}
	
		}
	}

	private void chooseHuman() {
		while (true) {
			System.out.println("You've selected Human.");
			System.out.println("Enter the traits you want to know (name, age, speed, feed,info,env,weather,content,truth): ");

			Human human = new Human();

			String Human = scanner.nextLine();

			switch (Human) {
			case "name":
				System.out.println("Name: " + human.getName());
				break;
			case "age":
				System.out.println("Age: " + human.getAge());
				break;
			case "speed":
				System.out.print("Speed: ");
				human.Speed(35);
				break;
			case "feed":
				human.feedit();
				break;
			case "fact":
				//human.fact(true);
				break;
			case "info":
				System.out.println("About human");
				human.displayAllInformation(human);
				break;
			case "envi":
				human.envi();
				break;
			case "weather" :
				human.weather();
				break;
			case "contant":
				human.content();
				break;
			case "truth":
				human.truth();
				break;
				
			default:
				System.out.println("Invalid attribute choice");
				break;
			}
		    System.out.println("Do you want to choose another Human? (yes/no)");
	        String continueChoice = scanner.nextLine();
	        if (!continueChoice.equalsIgnoreCase("yes")) {
	            break; 
	        }
	    }
	}

	private Typesanimal getAnimalType(int animalsTypeChoice) {
		switch (animalsTypeChoice) {
		case 1:
			return Typesanimal.MAMMALS;
		case 2:
			return Typesanimal.FISH;
		case 3:
			return Typesanimal.HUMAN;
		case 4:
			return Typesanimal.BIRDS;
		case 5:
			return Typesanimal.REPTILES;
		default:
			return null;
		}

	}
}
