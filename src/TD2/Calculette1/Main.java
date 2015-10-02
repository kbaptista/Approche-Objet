package TD2.Calculette1;

public class Main {

	public static void main(String args []) {
		Memory m = new Memory();
		Calculateur c = new Calculateur();
		System.out.println(m.MS(c.addition(6, 5)));
		System.out.println(m.MPlus(c.division(7,2)));
		
	}

}
