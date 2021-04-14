
public abstract class NormalLoc extends Location {
	public NormalLoc(Player player , String name) {
		super(player);
		this.name = name ;
	}

	@Override
	public boolean getLocation() {	
		return true;
	}
}
