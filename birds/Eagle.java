package birds;

import Interface.Enviroments;
import Interface.Feed;
import Interface.Movment;

public class Eagle extends Birds implements Feed,Enviroments,Movment{
	
	@Override
	public void feedit() {
	System.out.println("Eagles primarily eat a diet of fish, birds, small mammals, and carrion.");
		
	}

	@Override
	public void envi() {
		System.out.println("Eagles dwell in diverse habitats worldwide including mountains and open areas");
		
	}

	@Override
	public void weather() {
		System.out.println("Eagles are often more active during clear and sunny weather.");
	}

	@Override
	public void content() {
		System.out.println("Eagles are present in various European countries,");
		
		
	}

	
	@Override
	public void movment() {
	System.out.println("The" +getName()+"Fly");
		
	}


}
