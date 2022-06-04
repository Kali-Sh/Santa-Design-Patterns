public class Santa {
	
	private ICommand command;
	private static Santa santa;
	
	private Santa() {
	}
	
	public static Santa getInstance() {
		if(santa==null)
			santa = new Santa();
		return santa;
			
	}
	public ICommand getCommand() {
		return command;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void makeMeToy() {
		if(this.command == null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}
}
