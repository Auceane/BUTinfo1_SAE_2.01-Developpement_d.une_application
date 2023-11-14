public class Division extends Operation {
	
	public Division(Expression op1,Expression op2){
		super(op1,op2);
	}
	
	public int valeur(){
		try{
			
			int test=this.getOPerande1().valeur()/this.getOPerande2().valeur();
			
		}
		catch(ArithmeticException e){
			System.out.println("On ne peut pas diviser par 0");
			throw e;
			}
		finally{return this.getOPerande1().valeur()/this.getOPerande2().valeur();}
	}
	
	public String toString(){
		return "("+this.getOPerande1()+" / "+this.getOPerande2()+")";
	}
	
}