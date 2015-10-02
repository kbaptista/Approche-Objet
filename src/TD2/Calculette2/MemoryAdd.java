package TD2.Calculette2;

public class MemoryAdd extends Memory {

	public MemoryAdd (float a){
		fils = new Leaf(a);
	}
	
	public MemoryAdd (int a){
		fils = new Leaf(a);
	}
	
	public MemoryAdd (Leaf a){
		fils = a ;
	}
	
	public float process() {
		value += fils.process();
		return value;
	}

	
}
