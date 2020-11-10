package Ejercicios0;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero");
		num1 = leer.nextInt();
		System.out.println("Dime otro numero");
		num2 = leer.nextInt();
		System.out.println("Dime otro numero");
		num3 = leer.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero 1 es el mayor");

		}else {
			if(num2>num1 && num2>num3){
				System.out.println("El numero mayor es el 2");
			}else {
				System.out.println("El numero mayor es el 3");
			}
			
			
		}

	}

}
