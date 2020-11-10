package Ejercicios0;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 0, cont = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime hasta que numero sumo");
		nums = leer.nextInt();

		while (nums > 0) {
			cont = cont + nums;
			nums--;
			
		}
		System.out.println(cont);

	}

}
