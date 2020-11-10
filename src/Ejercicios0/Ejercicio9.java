package Ejercicios0;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime un numero");
		num=leer.nextInt();
		
		if (num == 0) {
			System.out.println("El numero no es par ni impar");
		}else {
			if(num%2 == 0){
				System.out.println("El numero es par");
				
				
			}else {
				System.out.println("El numero es impar");
			}
			
			
		}
		
		

	}

}
