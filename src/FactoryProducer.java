public class FactoryProducer {

	public static AbstractToyFactory getFactory(String factoryName) {
		
		if(factoryName.equals("Color")) {
			return new ColorFactory();
		}
		
		if(factoryName.equals("Toy")) {
			return new ToyFactory();
		}
		
		System.out.println("Unknown factory");
		return null;

	}
	
}
