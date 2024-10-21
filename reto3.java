import java.util.Scanner;
public class reto3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int numPredefinido = 7;
		int introducido;
		boolean encontrado = false;
		
		System.out.print("Busque un numero entre el 1 y el 10. ");

		while (encontrado == false) {
		    System.out.println("Introduzca el numero que cree que es: ");
            introducido = sc.nextInt();

            if (introducido < numPredefinido) {
                System.out.println("El numero ingresado es menor al correcto.");

            } else if (introducido > numPredefinido) {
                System.out.println("El numero ingresado es mayor al correcto");

            } else {
                System.out.println("Enhorabuena! Has acertado.");
       encontrado= true;
            }
		}
	}
}
