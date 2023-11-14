public abstract class Operation{
	
	private Nombre NB1;
	private Nombre NB2;
	
	public Operation(Nombre Nb1,Nombre Nb2){
		this.NB1=Nb1;
		this.NB2=Nb2;
	}
	
	public abstract int valeur();
	
	public Nombre getOPerande1(){
		return this.NB1;
	}
	
	public Nombre getOPerande2(){
		return this.NB2;
	}
	
}