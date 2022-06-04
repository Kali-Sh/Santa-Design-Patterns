public class ToyFactory extends AbstractToyFactory{

	@Override
	IToy getToy(String toy) {
		if(toy.equals("Bike")) {
			return new Bike();
		}
		
		if(toy.equals("Doll")) {
			return new Doll();
		}
		System.out.println("No such toy");
		return null;
	}

	@Override
	IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
