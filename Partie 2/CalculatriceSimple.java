public class CalculatriceSimple{
	
	public static void main(String[] args){
		System.out.println("\n\nSAE R201 : Ma Calculatrice\nPartie 1\n\nHaude Auceane\nDa Costa Antoine\n\n");
		
		/*
		Partie 1
		*/
		System.out.println("\n\n\nPartie 1 : \n\n");
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
			System.out.println("\n"+d + " = " + d.valeur()) ; // doit afficher : // doit afficher : On ne peut pas diviser par 0 + Exception 
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		
		/*
		Partie 2
		*/
		
		System.out.println("\n\n\nPartie 2 : \n\n");
		
		
		System.out.println("\n\nTest 1: \n");
		Expression deux = new Nombre(2) ; 
		Expression trois = new Nombre(3) ; 
		Expression dixSept = new Nombre(17) ; 
		Expression s = new Soustraction(dixSept, deux) ; 
		Expression a = new Addition(deux, trois) ; 
		Expression d = new Division(s, a) ; 
		System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3 
		
		System.out.println("\n\nTest 2: \n"); 
		Expression neuf = new Nombre(9) ; 
		Expression dnt = new Division(neuf, trois) ;
		System.out.println(dnt + " = " + dnt.valeur()) ;// affiche (9 / 3) = 3
		
		try{
			System.out.println("\n\nTest 3: \n"); 
			System.out.println("\n9 / 0: \n");
			Expression zero = new Nombre(0) ; 
			Expression dz = new Division(neuf, zero) ;
			System.out.println(dz + " = " + dz.valeur());// Doit afficher : On ne peut pas diviser par 0 + Exception
		
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		try{
			System.out.println("\n\nTest 4: \n"); 
			System.out.println("\n9 / (6 - (2 *3)): \n");
			Expression six = new Nombre(6) ; 
			Expression dpt = new Multiplication(deux, trois) ;
			Expression spz = new Soustraction(six,dpt) ;
			Expression dz = new Division(neuf, spz) ;
			System.out.println(dz + " = " + dz.valeur());// Doit afficher : On ne peut pas diviser par 0 + Exception
		
		}
		catch (Exception e){
			System.out.println("\nException : "+e);
		}
		
		System.out.println("\n\nTest 5: \n");
		Expression quinze = new Nombre(15) ; 
		Expression vingt = new Nombre(20) ; 
		Expression cinquanteNeuf = new Nombre(59) ; 
		Expression s2 = new Soustraction(vingt, quinze) ; 
		Expression a2 = new Addition(vingt, s2) ; 
		Expression d2 = new Division(a2,s2) ; 
		Expression m1 = new Multiplication(d2,cinquanteNeuf );
		System.out.println(m1 + " = " + m1.valeur()) ; // affiche (((20 + (20 - 15)) / (20 - 15)) x 59) = 295
		
	}
	
	
}