package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto mouse = new Prodotto(1, "Mouse", "Logitech",12, 20);		
		System.out.println(mouse);
		System.out.println("-------------");
		
		
		Prodotto smartphone = new Smartphone (2, "Iphone", "Apple", 1000, 20, "1993", 512);
        System.out.println(smartphone);
        System.out.println("-------------");
        
        
        Prodotto tv = new Televisore (3, "Tv", "Samsung", 1000, 20, 100, 100, true);
        System.out.println(tv);
        System.out.println("-------------");
        
        Prodotto cuffie = new Cuffie (4, "Cuffie", "Bose", 400, 20, "Black", true);
        System.out.println(cuffie);
        System.out.println("-------------");
        
        
        
				
		
	}
	

}
