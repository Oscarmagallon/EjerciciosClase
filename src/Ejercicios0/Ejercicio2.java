package Ejercicios0;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num1=0,num2=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		System.out.println("Dime otro numero");
		num2=leer.nextInt();
		System.out.println();
		System.out.println("La suma de los dos numeros es " + (num1+num2));
		System.out.println("La resta de los dos numeros es " + (num1-num2));
		System.out.println("La division de los dos numeros es " + (num1/num2));
		System.out.println("La multiplicación de los dos numeros es " + (num1*num2));
		
	}

}
