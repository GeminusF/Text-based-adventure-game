import java.util.Scanner;

public class Game {
	Player player ;
	Location location ;
	Scanner input3 = new Scanner(System.in) ; 
	
	public void login() {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Macera Oyuna Hos Geldiz !") ;
        System.out.print("Takma Isminizi Giriniz :") ;
        String nickname = input.nextLine() ;
        player = new Player(nickname) ;
        player.selectChar() ;
        start() ;
	}
	
	public void start() {
		System.out.println("Ethan Hunti Kiskandiracak Tehlikeli Ve Macera Dolu Yolculuk Basliyor! Ilk gedeceginiz yeri seciniz : ");
		while(true) {
			System.out.println("1.Guvenli Ev") ;
			System.out.println("2.Orman") ;
			System.out.println("3.Magara") ;
			System.out.println("4.Cay") ;
			System.out.println("5.Magaza") ;
			System.out.println("Gideceyiginiz yeri seciniz :");
			int gtl = input3.nextInt() ;
		    while(gtl < 0 || gtl > 5 ) {
		    	System.out.println("Gidebileceyiniz Gecerli Yer Seciniz") ;
		    	gtl = input3.nextInt() ;
		    }
		    
		    switch(gtl) {
		    case 1:
		    	location = new SafeHouse(player) ;
		    	break ;
		    case 2:
		    	location = new Forest(player) ;
		    	break ;
		    case 3:
		    	location = new Cave(player) ;
		    	break ;
		    case 4:
		    	location = new River(player) ;
		    	break ;
		    case 5:
		    	location = new Toolstore(player) ;
		    	break ;
		    }
		    if(location.getClass().getName().equals("SafeHouse")) {
		    	if(player.getInvertory().isFirewood() &&player.getInvertory().isFood() && player.getInvertory().isWater()) {
		    		System.out.println("Tebrikler Oyunu Kazandiniz ! ") ;
		    		break ;	
		    	} 	
		    }
		    if(!location.getLocation()) {
		    	System.out.println("Oyun Bitdi");
		    	break ;
		    }
		}
	}
	
	
	
	
	

}
