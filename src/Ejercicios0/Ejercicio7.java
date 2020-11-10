package Ejercicios0;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chicos,chicas,total;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime el numero de chicos");
		chicos=leer.nextInt();
		System.out.println("Dime el numero de chicas");
		chicas=leer.nextInt();
		total = (chicos + chicas);
		System.out.println("El porcentaje de chicos es " + (chicos/total*100)+ "%");
		System.out.println("El porcentaje de chicas es " + (chicas/total*100)+"%");


	}

}

