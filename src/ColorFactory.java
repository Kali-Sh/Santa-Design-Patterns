public class ColorFactory extends AbstractToyFactory{

	@Override
	IToy getToy(String toy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IColor getColor(String color) {
		if(color.equals("Purple")) {
			return new Purple();
		}
		
		if(color == "Red") {
			return new Red();
		}
		System.out.println("Unknown color");
		return null;
	}
}
