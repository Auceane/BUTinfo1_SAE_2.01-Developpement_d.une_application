public abstract class Expression{
	
	public abstract int valeur(); 
	/* 
	Je n'est pas pu mettre ce valeur() en double
	car mon compilateur ne vouler pas que le valeur()
	de Nombre soit en int, si je le mettais, et que si je 
	met tout en double au lieu de me faire une 
	exception en division, ca me fait Infinity.
	*/
}