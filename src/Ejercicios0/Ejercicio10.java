package Ejercicios0;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime un numero");
		num=leer.nextFloat();
		
		if (num == 0) {
			while (num==0) {
				System.out.println("Dime otro numero");
				num=leer.nextFloat();
				
			}
			if(num%2 == 0){
				System.out.println("El numero es par");
				
				
			}else {
				System.out.println("El numero es impar");
			}
			
			
		}
		
		

	}

}