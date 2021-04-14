// 2 defe girmeyi duzelt
public class Toolstore extends NormalLoc {
	public Toolstore(Player player) {
		super(player, "Market");
		
	}
	
	@Override
	public boolean getLocation() {
		System.out.println("Para Pesin Kirmizi Mesin! Magazadasin. Paran : " + player.getMoney()) ;
		System.out.println("1) Silahlar") ;
		System.out.println("2) Zirhlar") ;
		System.out.println("3) Cikis") ;
		System.out.println("Seciminiz :") ;
		int choice = scan.nextInt() ;
		int itemid ;
		switch(choice) {
		//silah
		case 1 :
			itemid = weaponMenu() ;
            buyWeapon(itemid) ;
			break;
		//zirh	
		case 2 :
			itemid = armorMenu() ;
			buyArmor(itemid) ;
			break ;
		//cikis	
		default :
			break ;
		}
		return true;
	}
	
	public int weaponMenu() {
		System.out.println(" 1.Tabanca : Hasar 2 , Para 25") ;
		System.out.println(" 2.Kilinc :  Hasar 3 , Para 35") ;
		System.out.println(" 3.Tufenk :  Hasar 7 , Para 45") ;	
		System.out.println(" 4.Cikis") ;
		System.out.println("Satin Almak Istediyiniz Silahi Secin :") ;
		int wchoice = scan.nextInt() ;
		return wchoice ;
	}
	
	public void buyWeapon (int ItemID) {
		int damage = 0 , price =0 ;
		String WeaponName = null ;
			switch(ItemID) {
			case 1:
				WeaponName = "Tabanca" ;
				damage = 2 ;
				price = 5 ; //25
				break ;
			case 2:
				WeaponName = "Kilinc" ;
				damage = 3 ;
				price = 35 ;
				break ;
			case 3:
				WeaponName = "Tufenk" ;
				damage = 7 ;
				price = 45 ;
				break ;	
			case 4:
				System.out.println("Cikis Yapiliyor") ;
			default:
				break ;
			}
			if(price > 0) {
				if(player.getMoney() > price ) {
					player.getInvertory().setwName(WeaponName) ;
					player.getInvertory().setwDmg(damage) ;
					player.setMoney(player.getMoney() - price ) ;
					System.out.println(WeaponName +" satin aldiniz yeni hasariniz : " + player.getTotalDamage()) ;
					System.out.println("Kalan Paraniz : " + player.getMoney());
				}else {
					System.out.println("Bakiye Yetersiz");
				}
			}		
	}
	
	public int armorMenu() {
		System.out.println(" 1.Hafif : Engelleme 1 , 15") ;
		System.out.println(" 2.Orta :  Engelleme 3 , 25") ;
		System.out.println(" 3.Agir :  Engelleme 5 , 40") ;
		System.out.println(" 4.Cikis") ;
		System.out.println(" Satin Almak Istediyiniz Silahi Secin :") ;
		int achoice = scan.nextInt() ;
		return achoice ;
	}
	
	public void buyArmor(int ItemID) {
		int defence = 0 , price = 0 ;
		String ArmorName = null;
		switch(ItemID) {
		case 1:
			defence = 1 ;
			ArmorName = "Hafif" ;
			price = 15 ;
			break ;
		case 2:
			defence = 3 ;
			ArmorName = "Orta" ;
			price = 25 ;
			break ;
		case 3:
			defence = 5 ;
			ArmorName = "Agir" ;
			price = 40 ;
			break ;
		case 4:
            System.out.println("Cikis Yapiliyor") ;
            break ;
        default:
        	break ;
		}	
		if(price > 0) {
				if(player.getMoney() >= price ) {
					player.getInvertory().setaName(ArmorName) ;
					player.getInvertory().setaAvoid(defence) ;
					player.setMoney(player.getMoney() - price ) ;
					System.out.println(ArmorName +" zirh satin aldiniz yeni zirhla kurtuldunuz hasar : " + player.getInvertory().getaAvoid()) ;
					System.out.println("Kalan Paraniz : " + player.getMoney());
				}else {
					System.out.println("Bakiye Yetersiz");
				}
			}
	}
		
		
	
}