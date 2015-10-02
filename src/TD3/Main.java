package TD3;

public class Main {

	
	public static void main(String[] args) {
		Catalogue Fnac = new Catalogue();
		
		Produit PS4 = new Produit("Playstation 4", "Consôle de salon produite par Sony.", "Jeu Vidéo", 400.0);
		Produit XBoxOne = new Produit("XBox One", "Consôle de salon produite par Microsoft.", "Jeu Vidéo", 350.0);
		Produit Galaxy_S_5 = new Produit("Galaxy S 5", "Smartphone produit par Samsung", "Téléphonie", 800.0);
		Produit WiiU = new Produit("Wii U");
		
		System.out.println(PS4);
		
		Fnac.add(PS4);
		Fnac.printProducts();
		System.out.println(Fnac.getFromListe("Playstation 4"));
		System.out.println(Fnac.getFromListe("Wii U"));
		Fnac.add(XBoxOne);
		Fnac.printProducts();
		
		Fnac.add(Galaxy_S_5);
		Fnac.printProducts();
		
		Fnac.trierParLePrix(1);
		Fnac.printProducts();
		
		Fnac.delete(WiiU);
		
		Fnac.delete(PS4);
		Fnac.printProducts();
		
		Fnac.delete(XBoxOne);
		Fnac.delete(Galaxy_S_5);
		Fnac.printProducts();
		
	}

}
