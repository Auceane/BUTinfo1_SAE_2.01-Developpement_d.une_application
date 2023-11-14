public class CalculatriceSimple{
	
	public static void main(String[] args){
		System.out.println("\n\nSAE R201 : Ma Calculatrice\nPartie 1\n\nHaude Auceane\nDa Costa Antoine\n\n");
		
		
		/*
		Addition
		*/
		
		
		System.out.println("\n\n\nAddition : \n\n");
		try{
			Nombre dix = new Nombre(10) ; 
			Nombre cinq = new Nombre(5) ; 
			Operation a = new Addition(cinq,dix) ; 
			System.out.println(a + " = " + a.valeur()) ; // doit afficher : (5 + 10) = 15
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		try{
			Nombre dix = new Nombre(10) ; 
			Nombre mcinq = new Nombre(-5) ; 
			Operation a = new Addition(dix,mcinq) ; 
			System.out.println("\n"+a + " = " + a.valeur()) ; // doit afficher : (10 + -5) = 5
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		/*
		Soustraction
		*/
		
		
		System.out.println("\n\n\nSoustraction : \n\n\n");
		
		try{
			Nombre dix = new Nombre(10) ; 
			Nombre cinq = new Nombre(5) ; 
			Operation s = new Soustraction(cinq,dix) ; 
			System.out.println(s + " = " + s.valeur()) ; // doit afficher : (5 - 10) = -5
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		try{
			Nombre dix = new Nombre(10) ; 
			Nombre cinq = new Nombre(5) ; 
			Operation s = new Soustraction(dix,cinq) ; 
			System.out.println("\n"+s + " = " + s.valeur()) ; // doit afficher : (10 - 5) = 5
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		try{
			Nombre dix = new Nombre(10) ; 
			Nombre mcinq = new Nombre(-5) ; 
			Operation s = new Soustraction(dix,mcinq) ; 
			System.out.println("\n"+s + " = " + s.valeur()) ; // doit afficher : (10 - -5) = 15
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		/*
		Multiplication
		*/
		
		
		System.out.println("\n\n\nMultiplication : \n\n\n");
		try{
			Nombre six = new Nombre(6) ; 
			Nombre trois = new Nombre(3) ; 
			Operation m = new Multiplication(six,trois) ; 
			System.out.println(m + " = " + m.valeur()) ; // doit afficher : (6 * 3) = 18
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		try{
			Nombre six = new Nombre(6) ; 
			Nombre mtrois = new Nombre(-3) ; 
			Operation m = new Multiplication(six,mtrois) ; 
			System.out.println("\n"+m + " = " + m.valeur()) ; // doit afficher : (6 * -3) = -18
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		/*
		Division
		*/
		
		System.out.println("\n\n\nDivision : \n\n\n");
		try{
			Nombre six = new Nombre(6) ; 
			Nombre trois = new Nombre(3) ; 
			Operation d = new Division(six,trois) ; 
			System.out.println(d + " = " + d.valeur()) ; // doit afficher : (6 / 3) = 2
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		try{
			Nombre six = new Nombre(6) ; 
			Nombre mtrois = new Nombre(-3) ; 
			Operation d = new Division(six,mtrois) ; 
			System.out.println("\n"+d + " = " + d.valeur()) ; // doit afficher : (6 / -3) = -2
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		System.out.println("\n\n6 / 0 :\n");
		try{
			Nombre six = new Nombre(6) ; 
			Nombre zero = new Nombre(0) ; 
			Operation d = new Division(six,zero) ; 
			System.out.println("\n"+d + " = " + d.valeur()) ; // doit afficher : On ne peut pas diviser par 0 + Exception 
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
	}
	
	
}