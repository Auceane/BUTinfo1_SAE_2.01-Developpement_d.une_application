public class Division extends Operation {
	
	public Division(Nombre Nb1,Nombre Nb2){
		super(Nb1,Nb2);
	}
	
	public int valeur(){
		
		try{
			
			int test=this.getOPerande1().getValeurNombre()/this.getOPerande2().getValeurNombre();
			
		}
		catch(ArithmeticException e){
			System.out.println("On ne peut pas diviser par 0");
			throw e;
			}
		finally{return this.getOPerande1().getValeurNombre()/this.getOPerande2().getValeurNombre();}
	}
	
	public String toString(){
		return "("+this.getOPerande1().getValeurNombre()+" / "+this.getOPerande2().getValeurNombre()+")";
	}
	
}