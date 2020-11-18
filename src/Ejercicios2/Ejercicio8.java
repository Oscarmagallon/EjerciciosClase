package Ejercicios2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menor=110000,mayor=-1000,num=-1;
		Scanner leer = new Scanner(System.in);
		while(num!=0) {
			System.out.println("Dime un numero");
			num=leer.nextInt();
			if(num!=0) {
				if(num>mayor) {
					mayor=num;
				}
				if (num<menor) {
					menor= num;
				}
			}
		}
		System.out.println("El mayor es " + mayor + " y el menor " + menor);
		
	}

}
