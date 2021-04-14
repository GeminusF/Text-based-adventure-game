
public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player , "Guvenli Ev") ;				
	}
	
	@Override
	public boolean getLocation() {
		player.setHealth(player.getrHealth()) ;
		System.out.println("Iyislestiniz" + " " + "Can :" +player.getHealth()) ;
		System.out.println("Suan Guvenli Evdesiniz.") ;
		return super.getLocation() 	;
	}

}
