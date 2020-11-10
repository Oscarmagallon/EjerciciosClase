package Ejercicios0;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,cont=0,suma=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime un numero");
		num=leer.nextInt();
		cont = num;
		if(num%2 != 0) {
			num=num+1;
		}
		
		while(cont>0) {
			suma=num+suma;
			num=num+2;
			cont--;
		}
		System.out.println(suma);

	}

}
