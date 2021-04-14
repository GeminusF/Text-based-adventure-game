import java.util.Scanner;

public class Player {
	Scanner input2 = new Scanner(System.in) ;
	private String name ,  character ;
	private int damage ,  health , money , rHealth ;
	private Inventory invertory ;
	
	public Player(String name) {
		this.name = name;
	    this.invertory = new Inventory() ;
	}
	
	public void selectChar() {
		switch(chaMenu()) {
		//Samuray
		case 1 :
			initPlayer("Samuray", 5 , 21 , 15);           
		    break ;
		
		//Okcu
		case 2 :
			initPlayer("Okcu", 7 , 18 , 20);   
		    break ;
		
		//Sovalye
		case 3 :  	
			initPlayer("Sovalye", 8 , 24 , 5);   
		    break ;
		default :
			System.out.println("Error") ;
		}
        System.out.println("Karakter : " + getCharacter() + " Hasar : " + getDamage() + " Saglik : " + getHealth() + " Para : " + getMoney()) ;
	}
	
	private int chaMenu() {
		// opsiyon yuxaridaki case yerine ifnen burda yaz
		System.out.println(this.name + " " + "Lutfen Karakterinizi Seciniz") ;
	    System.out.println("1) Samuray . Hasar : 5 Saglik : 21 Para : 15") ;
	    System.out.println("2) Okcu . Hasar : 7 Saglik : 18 Para : 20") ;
	    System.out.println("3) Sovalye . Hasar : 8 Saglik : 24 Para : 5") ;
	    System.out.print("Seciminiz :") ;
	    int cc = input2.nextInt() ;
	    while(cc < 1 || cc > 3 ) {
	    	System.out.println("Gecerli Karakter Seciniz") ;
	    	cc = input2.nextInt() ;
	    }
	    return cc ;
	}
	
    // opsiyon case bunla deyisdi
     public void initPlayer(String nm ,  int dmg , int heal , int mon) {
    	setCharacter(nm) ;
		setDamage(dmg) ;
		setHealth(heal) ;
		setMoney(mon) ;
		setrHealth(heal) ;
    }
	
    public int getTotalDamage() {
    	return this.damage + this.getInvertory().getwDmg() ;
    }
    	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Inventory getInvertory() {
		return invertory;
	}

	public void setInvertory(Inventory invertory) {
			this.invertory = invertory;
	}

	public int getrHealth() {
		return rHealth;
	}

	public void setrHealth(int rHealth) {
		this.rHealth = rHealth;
	}

	
	
	
	
	
	
    
	

}
