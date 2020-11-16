package Ejercicio3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vNums[];		
		vNums=new String[10];
		Scanner leer = new Scanner(System.in);
		for (int i =0;i<=9;i++) {
			System.out.println("Dime un numero");
			vNums[i]=leer.next();
			
		}
		for (int i = 0;i<=9;i++) {
			System.out.println(vNums[i]);
		}

	}

}
