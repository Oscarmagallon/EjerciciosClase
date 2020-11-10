package Ejercicios0;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		if(num1<= 0) {
			System.out.println("Error");
		}else {
			System.out.println("Del numero " + num1 + " su potencia es "+ (num1+num1)+ " y su raiz es " + (Math.sqrt(num1)));
		}
	
	}

}
