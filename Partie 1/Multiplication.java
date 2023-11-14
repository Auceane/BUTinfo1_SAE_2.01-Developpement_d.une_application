public class Multiplication extends Operation {
	
	public Multiplication(Nombre Nb1,Nombre Nb2){
		super(Nb1,Nb2);
	}
	
	public int valeur(){
		return this.getOPerande1().getValeurNombre()*this.getOPerande2().getValeurNombre();
	}
	
	public String toString(){
		return "("+this.getOPerande1().getValeurNombre()+" x "+this.getOPerande2().getValeurNombre()+")";
	}
	
}