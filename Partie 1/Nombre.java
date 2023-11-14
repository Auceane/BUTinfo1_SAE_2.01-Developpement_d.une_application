public class Nombre{
	
	private int valeurNombre;
	
	public Nombre(int nombre){
		this.valeurNombre=nombre;
	}
	
	public int getValeurNombre(){
		return this.valeurNombre;
	}
	
	public void setValeurNombre(int val){
		this.valeurNombre=val;
	}
	
	public String toString(){
		return "Le nombre contenu dans cette variable est"+this.valeurNombre;
	}
	
}