
public class DollCommand implements ICommand{

	private Board board;
	
	public DollCommand(Board board) {
		this.board=board;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.board.makeMeDoll();
	}
}
