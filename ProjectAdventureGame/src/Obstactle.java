import java.util.Random;
public class Obstactle {
	private String oName ;
	private int dmg , heal , award , maxNumber;
	public Obstactle(String oName, int dmg, int heal, int award , int maxNumber) {
		super();
		this.oName = oName;
		this.dmg = dmg;
		this.heal = heal;
		this.award = award;
		this.maxNumber = maxNumber ;
	}
	
	public int numObs() {
	    Random rand = new Random() ;
		return rand.nextInt(this.maxNumber) + 1;
	}
	
		
	public String getoName() {
		return oName;
	}
	public int getDmg() {
		return dmg;
	}
	public int getHeal() {
		return heal;
	}
	public int getAward() {
		return award;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	public void setAward(int award) {
		this.award = award;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	
	
	
		
	
	

}
