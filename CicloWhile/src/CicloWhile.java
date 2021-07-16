import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ciclo While
		 * while(!condicion){
		 * codigo
		 * codigo
		 * codigo
		 * }*/
		/* Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * 
		 * Nota: utilizar un ciclo while*/

		Scanner sc = new Scanner(System.in);
		boolean decision = true;

		while(decision) {
			System.out.println("Escribe tu primer número");
			int num1 = sc.nextInt();
			System.out.println("Escribe tu segundo número");
			int num2 = sc.nextInt();
			if(num1 == num2) {
			System.out.println("Los números " + num1 + " "+ num2 + " son iguales");
			decision = false;
			}
		}
	}

}
