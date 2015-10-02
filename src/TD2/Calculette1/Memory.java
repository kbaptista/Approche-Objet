package TD2.Calculette1;

public class Memory {
	
	private float memory;
	
	/*
	 * remplace contenu
	*/
	public float MS (float a){
		memory = a ;
		return memory;
	}
	
	/*
	 * Ajoute a au nombre en memoire
	*/
	public float MPlus (float a){
		memory += a ;
		return memory;
	}
	
	/*
	 * Retire a au nombre en memoire
	*/
	public float MMoins (float a){
		memory -= a ;
		return memory;
	}
	
	/*
	 * Retourne la veleur en memoire
	*/
	public float MR (){
		return memory;
	}
	
	/*
	 * Vider la memoire
	*/
	public float MC (){
		memory = 0 ;
		return memory;
	}
	
	public Memory(){
		memory = 0;
	}
	
	public Memory(float a){
		memory = a;
	}
}
