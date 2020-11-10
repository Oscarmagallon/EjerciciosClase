package Ejercicios2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el primer numero del rango");
		num1 = leer.nextInt();
		System.out.println("Dime el ultimo numero del rango");
		num2 = leer.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
