
public class BikeCommand implements ICommand{

	private Board board;
	
	public BikeCommand(Board board) {
		this.board=board;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.board.makeMeBike();
	}

}
