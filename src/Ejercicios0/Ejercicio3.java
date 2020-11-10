package Ejercicios0;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num1,num2;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		System.out.println("Dime otro numero");
		num2=leer.nextInt();
		if (num1>num2) {
			System.out.println(num1+ " es mayor que "+ num2);
			
		}else {
			if(num1==num2) {
		
				System.out.println("Los numeros son iguales");
			}else {
				System.out.println(num2+ " es mayor que "+ num1);
			}
	
	}	
			
			
			
	}		
		
}
	



		
				


