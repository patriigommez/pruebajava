import java.util.Scanner;
public class ejextraunidad4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mayor =  Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int suma = 0;
		 
		for (int i = 0; i <= 0; i ++)   {
			System.out.print("Introduce el número" + (i + 1) + ": ");
			int numero = scanner.nextInt();

			if (numero > mayor) {
              		 	mayor = numero;
		}
			if (numero < menor) {
               			 menor = numero;
		}
			suma += numero;
	  }
		double promedio	= suma /10.0;

		System.out.println("El mayor número introducido es: " + mayor);
       		System.out.println("El menor número introducido es: " + menor);
        	System.out.println("La suma de todos los números es: " + suma);
        	System.out.println("El promedio de los números es: " + promedio);
        
        	scanner.close();	
  }	
}
