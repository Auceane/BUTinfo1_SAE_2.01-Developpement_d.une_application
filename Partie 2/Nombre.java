public class Nombre extends Expression{
	
	private int valeurNombre;
	
	public Nombre(int nombre){
		this.valeurNombre=nombre;
	}
	
	public int valeur(){
		return this.valeurNombre;
	}
	
	public void setValeurNombre(int val){
		this.valeurNombre=val;
	}
	
	public String toString(){
		return ""+this.valeurNombre;
	}
	
}