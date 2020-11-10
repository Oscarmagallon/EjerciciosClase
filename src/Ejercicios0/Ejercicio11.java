package Ejercicios0;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bach = "", prueba = "";
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Tienes bachillerato?");
		bach = leer.next();
		System.out.println("¿Has superado la prueba de acceso?");
		prueba=leer.next();
		if (bach.equalsIgnoreCase("si") || prueba.equalsIgnoreCase("si")) {
			System.out.println("Puedes acceder a FP");

		}else {
			System.out.println("No puedes entrar");
		}
		
	}
}
