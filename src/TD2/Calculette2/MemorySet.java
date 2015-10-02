package TD2.Calculette2;

public class MemorySet extends Memory {

	public MemorySet (float a){
		fils = new Leaf(a);
	}
	
	public MemorySet (int a){
		fils = new Leaf(a);
	}
	
	public float process(){
		value = fils.process(); 
		return 0.0f;
	}
}
