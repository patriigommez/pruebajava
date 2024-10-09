public class reto2 {
	public static void main(String[] args) {
		//Pedir nombre
		
		String nombre = "Ana";
		String apellidos = "Ruiz Gomez";
	
		
		String saludo = ("Hola, " + nombre + apellidos);
		String cargo = "Secretaria" ;
		
		System.out.println(nombre.toUpperCase());
		
		int espacioApellidos = apellidos.indexOf(" ");
		String Ruiz = apellidos.substring(0, espacioApellidos);
		String Gomez = apellidos.substring(espacioApellidos + 1);

		System.out.println(Ruiz.toLowerCase());
		System.out.println(Gomez.toUpperCase());
		
		

	}	
}
