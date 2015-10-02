package TD2.Calculette2;

public class Addition extends OperationBinaire{
	
	public Addition(TreeNode droit, TreeNode gauche){
		filsDroit = droit;
		filsGauche = gauche;
	}
	
	public float process(){
		return filsDroit.process() + filsGauche.process();
	}

}
