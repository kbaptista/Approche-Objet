package TD2.Calculette2;

public class Leaf implements TreeNode {

	private float value ;
	public float process() {
		return value;
	}
	
	public Leaf (){
		value = 0.0f;
	}
	
	public Leaf (int value){
		this.value = (float)value;
	}
	
	public Leaf (float value){
		this.value = value ;
	}

}
