
public abstract class  BattleLoc extends Location {
    protected Obstactle obstactle ;
    protected String aItem ;
    
	public BattleLoc(Player player , String name, Obstactle obstactle ,String aItem ) {
		super(player);
		this.name = name ;
		this.obstactle = obstactle ; 
		this.aItem = aItem ;
	}
	
	@Override
	public boolean getLocation() {
		int numObs = obstactle.numObs() ;
		System.out.println("Suan buradasiniz" + this.getName()) ;
		System.out.println("Dikkatli ol! Burada " + numObs + " tane " + obstactle.getoName() + " var") ;
		System.out.println("<S>avas ve ya <K>ac") ;
		String selCase = scan.nextLine() ;
		selCase = selCase.toUpperCase() ;
		if(selCase.equals("S")) {
			if(combat(numObs)) {
				System.out.println(this.getName() +" Bolgesindeki tum Dusman(lar)i Yendinizi") ;
				if(this.aItem.equals("Food") && player.getInvertory().isFood() == false) {
					System.out.println(this.aItem + " Kazandiniz!") ;
					player.getInvertory().setFood(true) ;	
				}else if(this.aItem.equals("Firewood") && player.getInvertory().isFirewood() == false) {
					System.out.println(this.aItem + " Kazandiniz!") ;
					player.getInvertory().setFirewood(true) ;
				}else if(this.aItem.equals("Water") && player.getInvertory().isWater() == false) {
					System.out.println(this.aItem + " Kazandiniz!") ;
					player.getInvertory().setWater(true) ;
				}	
				return true ;
			}
			if(player.getHealth() <= 0) {
				System.out.println("Oldunuz !") ;
				return false ;
			}
		}
		return true;
	}
	
	public boolean combat (int numObs) {
		for (int i = 0 ;  i < numObs ; i++) {
			int defObsHealth = obstactle.getHeal() ;
			playerStats() ;
			enemyStats() ;
			while(player.getHealth() > 0 && obstactle.getHeal() > 0) {
				System.out.println("<V>ur ve ya <K>ac") ;
				String selCase2 = scan.nextLine() ;
				selCase2 = selCase2.toUpperCase() ;
				if(selCase2.equals("V")) {
					System.out.println("Saldirdiniz") ;
					obstactle.setHeal(obstactle.getHeal() - player.getTotalDamage()) ;
					afterHit();
					if(obstactle.getHeal() > 0) {
						System.out.println("Canavar Saldirdi") ;
						player.setHealth(player.getHealth() - (obstactle.getDmg() - player.getInvertory().getaAvoid() )) ;
						afterHit();
					}
				}else {
					return false ;
				}
			}
			
			if(obstactle.getHeal() < player.getHealth() ) {
				System.out.println("Dusmani Oldurdunuz !") ;
				player.setMoney(player.getMoney() + obstactle.getAward()) ;
				System.out.println("Savas Ganimeti ile Paraniz : " + player.getMoney()) ;
				obstactle.setHeal(defObsHealth) ;
			}else {
				return false ;
			}
			System.out.println("-------------") ;
		}
		return true ;
	}
	
	public void playerStats() {
		System.out.println("Oyuncu Degerleri\n --------") ;
		System.out.println("Can : " + player.getHealth()) ;
		System.out.println("Hasar : " + player.getTotalDamage() ) ;
		if(player.getInvertory().getwDmg() > 0) {
			System.out.println("Silah :" +player.getInvertory().getwName()) ;
		}
		if(player.getInvertory().getaAvoid() > 0) {
			System.out.println("Zirh :" +player.getInvertory().getaName()) ;
		}	
	}
	
	
	public void enemyStats() {
		System.out.println(obstactle.getoName() + " Degerleri\n --------") ;
		System.out.println("Can : " + obstactle.getHeal()) ;
		System.out.println("Hasar : " + obstactle.getDmg()) ;
		System.out.println("Odul : " + obstactle.getAward()) ; 
	}
	
	public void afterHit() {
		System.out.println(obstactle.getoName() +" Kalan Cani : " + obstactle.getHeal()) ;
		System.out.println(player.getName() + " Kalan Caniniz : "+ player.getHealth()) ;
		System.out.println() ;
	}


	

}
