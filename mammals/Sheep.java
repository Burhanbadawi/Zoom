package mammals;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Sheep extends Mammals implements Feed,Enviroments,Movment {
	
		

		@Override
		public void feedit() {
			System.out.println("Sheep are herbivores and graze on grasses and vegetation.");
			
		}

		@Override
		public void envi() {
			System.out.println("sheep are found in diverse grasslands and mountainous regions worldwide ");
			
			
		}

		@Override
		public void weather() {
			System.out.println("Sheep are well-suited for colder weather due to their thick coats of wool.");
			
			
		}

		@Override
		public void content() {
			System.out.println("Australia is known for having one of the largest sheep populations in the world.");
			
		}
		@Override
		public void movment() {
		System.out.println("The" +getName()+"Walk");
			
		}
}
