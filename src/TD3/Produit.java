 package TD3;

public class Produit {

	private String nom, description, type_de_produit ;
	private float prix ;
	
	
	
	/* Constructeurs */
	
	public Produit(String name, String descriptor, String type, double price)  {
		nom = name;
		description = descriptor;

		type_de_produit = type;
		prix = (float)price;
	}
	
	public Produit(String name, String descriptor, String type, float price)  {
		nom = name;
		description = descriptor;

		type_de_produit = type;
		prix = price;
	}
	
	public Produit(String name, String descriptor, String type)  {
		nom = name;
		description = descriptor;

		type_de_produit = type;
		prix = 9999.99f;
	}
	
	public Produit(String name, String descriptor) {
		nom = name;
		description = descriptor;

		type_de_produit = "Produit sans type";
		prix = 9999.99f;
	}
	
	public Produit(String name) {
		nom = name;
		description = "Produit sans description";

		type_de_produit = "Produit sans type";
		prix = 9999.99f;
	}
	
	public Produit() {
		nom = "Produit sans nom";
		description = "Produit sans description";

		type_de_produit = "Produit sans type";
		prix = 9999.99f;
	}
	
	
	
	/* Getteurs et Setteurs */
	
	public String getNom() {
		String res = nom;
		return res;
	}
	public String getDescription() {
		String res = description;
		return res;
	}
	public String getType_de_produit() {
		String res = type_de_produit ;
		return res;
	}
	public float getPrix() {
		float res = prix;
		return res;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setType_de_produit(String type_de_produit) {
		this.type_de_produit = type_de_produit;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom;
	}
	
}
