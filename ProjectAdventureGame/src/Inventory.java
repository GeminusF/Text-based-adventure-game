
public class Inventory {
	private boolean water , food ,firewood ;
	private String wName , aName ;
	private int wDmg , aAvoid ; 
	
	Inventory() {
		this.water = false ;
	    this.food = false ;
	    this.firewood = false ; 
	    this.wDmg = 0 ;
	    this.aAvoid = 0 ; 
	    this.wName = null ;
	    this.aName = null ;
	}
	
	
	
	
	

	public boolean isWater() {
		return water;
	}

	public boolean isFood() {
		return food;
	}

	public boolean isFirewood() {
		return firewood;
	}

	public String getwName() {
		return wName;
	}

	public String getaName() {
		return aName;
	}

	public int getwDmg() {
		return wDmg;
	}

	public int getaAvoid() {
		return aAvoid;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public void setwDmg(int wDmg) {
		this.wDmg = wDmg;
	}

	public void setaAvoid(int aAvoid) {
		this.aAvoid = aAvoid;
	}
	
	


	

}
