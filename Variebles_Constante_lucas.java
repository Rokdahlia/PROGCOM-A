package clase;

public class Variebles_Constante {

	public static void main(String[] args) {
		// Tipos de datos primitivos
		// Entros - int 
		int edad= 17 ;
		System.out.println("Mi edad es: " +edad);
		//Decimales 
		double estatura= 1.81;
		System.out.println("Mi estatura es: "+estatura+" Metros");
		
		// alfanumerico 
		String nombre="Lucas";
		System.out.println(nombre.getClass().getSimpleName());
		//char - un solo caracter
		char a= 's'; 
		
		//Booleano 
		boolean Verdad=true;
		
		var flor="Holitas";
		System.out.println(flor);
		
		final String mail="lgomez198@unab.edu.co";
		System.out.println(mail);
		// mail= "lgomez198@unab.edu.co"
		// System.out.println(mail);
		
	}

}
