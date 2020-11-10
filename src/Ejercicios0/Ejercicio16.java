package Ejercicios0;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "eureka", intento = "";
		int cont = 3;
		Scanner leer = new Scanner(System.in);
		while (cont > 0) {
			System.out.println("Dime la palabra clave");
			intento=leer.next();
			if(intento.equalsIgnoreCase(clave)) {
				cont=-1;
			}
			cont --;
			
		

		}
	
	}

}
