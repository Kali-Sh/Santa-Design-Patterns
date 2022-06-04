import java.util.List;

public class Dwarf implements IObserve {

	private String name;
	private IAmObservable board;
	private String toy;

	public Dwarf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.board == null) {
			System.out.println("No topic set");
			return;
		}
		String lastToy = getToy();
		this.setToy(lastToy);
		System.out.println(this.name + " received: " + lastToy);
	}

	@Override
	public void setBoard(IAmObservable board) {
		this.board = board;
	}

	public String getToy() {
		return this.board.getUpdate();
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

}
