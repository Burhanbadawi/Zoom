package mammals;


import Interface.Enviroments;
import Interface.Feed;

public class Lion extends Mammals implements Feed,Enviroments {
	
		 public Lion(){
		 
		setName("Lion");
		setAge(" around 10 to 14 years in the wild");

		 }
		
		 

	

		

		@Override
		public void weather() {
			System.out.println("Lions are adapted to a variety of temperatures but generally thrive in warm to hot climates. ");
			
		}

		@Override
		public void content() {
			System.out.println("Lions are primarily found in various countries across Africa");
			
		}

		@Override
		public void feedit() {
			System.out.println(" Lions are well adapted for hunting ungulates. ");
			
		}

		@Override
		public void envi() {
		
			
		}
		

		 
	 }

