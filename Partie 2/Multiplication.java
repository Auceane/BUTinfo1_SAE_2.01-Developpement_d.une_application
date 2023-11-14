public class Multiplication extends Operation {
	
	public Multiplication(Expression op1,Expression op2){
		super(op1,op2);
	}
	
	public int valeur(){
		return this.getOPerande1().valeur()*this.getOPerande2().valeur();
	}
	
	public String toString(){
		return "("+this.getOPerande1()+" x "+this.getOPerande2()+")";
	}
	
}