package TD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Catalogue {

	private ArrayList<Produit> liste;
	
	public Catalogue() {
		liste = new ArrayList<Produit>();
	}

	public Produit getFromListe(int indice) {
		return liste.get(indice);
	}

	public Produit getFromListe(String name){
		Iterator<Produit> i = liste.listIterator();
		Produit tmp ;
		while (i.hasNext()) {
			tmp = i.next();
			if (tmp.getNom().equals(name)){
				return tmp;
			}
		}
		
		return new Produit("No Match");
	}
	
	
	/* i doit être égal à 1 pour trier dans l'ordre croissant
	 * 				ou à -1 pour trier dans l'ordre décroissant
	 */
	public void trierParLePrix(int i){
		ArrayList<Produit> tmp = (ArrayList<Produit>) liste.clone();
		
		Collections.sort(tmp, new Comparator<Produit>() {
			@Override
			public int compare(Produit p1, Produit p2){
				return (p1.getPrix()<p2.getPrix())? 1: 0;
			}
		});
		
		liste = tmp;
	}
	
	public void add(Produit p){
		liste.add(p);
	}
	
	public int delete(Produit p){
		Iterator<Produit> i = liste.listIterator();
		Produit tmp ;
		while (i.hasNext()) {
			tmp = i.next();
			if (tmp.getNom().equals(p.getNom())){
				i.remove();
				return 1;
			}
		}
		System.out.println("Le produit n'est pas dans notre catalogue.");
		return 0;
	}
	
	@Override
	public String toString() {
		Iterator<Produit> i = liste.iterator();
		Produit tmp ;
		String res = new String("");
		while (i.hasNext()) {
			tmp = i.next();
			res = res.concat(tmp.getNom());
			res = res.concat("\n");
		}
		return res;
	}
	
	public void printProducts(){
		System.out.println(toString());
	}
	
}
