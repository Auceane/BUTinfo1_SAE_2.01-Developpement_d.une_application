public abstract class Operation extends Expression {
	
	private Expression OP1;
	private Expression OP2;
	
	public Operation(Expression op1,Expression op2){
		this.OP1=op1;
		this.OP2=op2;
	}
	
	
	
	public Expression getOPerande1(){
		return this.OP1;
	}
	
	public Expression getOPerande2(){
		return this.OP2;
	}
	
}