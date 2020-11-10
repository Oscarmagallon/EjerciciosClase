package Ejercicios0;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Dime el primer numero");
		num1=leer.nextInt();
		System.out.println("Dime el segundo numero");
		num2=leer.nextInt();
		System.out.println("Dime el tercer numero");
		num3=leer.nextInt();
		
		if(num1<0) {
			System.out.println("El producto de los tres numeros es " + (num1*num2*num3));
			
		}else {
			System.out.println("La suma de los tres numeros es " + (num1+num2+num3));
		}
		
		

	}

}
