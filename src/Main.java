public class Main {

	static Santa santa;
	
	public static void main(String[] args) {
		
		santa= Santa.getInstance();
		
		Board board = new Board();	
		AbstractToyFactory colorFactory = FactoryProducer.getFactory("Color");
		AbstractToyFactory toyFactory = FactoryProducer.getFactory("Toy");
		
		ICommand makeMeDoll = new DollCommand(board);
		ICommand makeMeBike = new BikeCommand(board);
	
		IObserve dwarf = new Dwarf("Dwarf 1");
		IObserve dwarf2 = new Dwarf("Dwarf 2");
		
		board.subscribe(dwarf);
		santa.setCommand(makeMeDoll);
		santa.makeMeToy();
		board.setToy("Doll");
		IToy doll = toyFactory.getToy("Doll");
		IColor color = colorFactory.getColor("Red");
		doll.create();
		color.color();
		board.unsubscribe(dwarf);
		
		board.subscribe(dwarf2);
		santa.setCommand(makeMeBike);
		santa.makeMeToy();
		board.setToy("Bike");
		IToy bike = toyFactory.getToy("Bike");
		IColor color2 = colorFactory.getColor("Red");
		bike.create();
		color2.color();
		board.unsubscribe(dwarf);
	}
}  