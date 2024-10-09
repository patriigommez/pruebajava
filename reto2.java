import java.util.Scanner;
public class reto2 {
	public static void main(String[] args) {
		
		try (Scanner scanner1 = new Scanner("Por favor, introduzca sus datos a continuacion:")) {
			
			//Pedir nombre y apellidos
			String nombre = scanner1.nextLine();
			System.out.print("Introduzca su nombre: ");

			String apellidos = scanner1.nextLine();
			System.out.print("Introduzca sus apellidos: ");

			//Pedir cargo
			String cargo = scanner1.nextLine(); 
			System.out.print("Introduzca su cargo: ");
			
			//Convertir nombre a mayusculas
			System.out.println(nombre.toUpperCase());
			
			// Dividir los apellidos
			int espacioApellidos = apellidos.indexOf(" ");
			String apellidos2 = apellidos.substring(0, espacioApellidos);
			String apellidos3 = apellidos.substring(espacioApellidos + 1);

			//Convertir primer apellido a minusc. y segundo a mayus.
			System.out.println(apellidos2.toLowerCase());
			System.out.println(apellidos3.toUpperCase());

			//Saludo
			String saludo = ("Hola, " + apellidos2 + apellidos3);
			System.out.println(saludo);	
			
			//Verificacion de entradas
			if (nombre.isEmpty()){
			    System.out.println("Error: Faltan datos. Por favor, introduzca su nombre.");
			    return;
			}
			if (apellidos.isEmpty()){
			    System.out.println("Error: Faltan datos. Por favor, introduzca sus apellidos.");
			    return;
			}

			//Salida
			String salida = "Atentamente, " + nombre + apellidos2 + apellidos3 + cargo;
			System.out.println(salida);
		}

	}	
}
