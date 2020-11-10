package Ejercicios0;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0,mes=0,ano=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime el dia en el que estamos");
		dia=leer.nextInt();
		System.out.println("Dime el mes en el que estamos");
		mes=leer.nextInt();
		System.out.println("Dime el a�o en el que estamos");
		ano=leer.nextInt();
		switch (mes) {
		case 1: 
			System.out.println(dia+"de Enero de"+ano);
			
			break;

		case 2:
			System.out.println(dia+" de Febrero de"+ano);
			break;
		
		case 3:
			System.out.println(dia+" de Marzo de"+ano);
			break;
		
		case 4:
			System.out.println(dia+" de Abril de"+ano);
			break;
			
		case 5:
			System.out.println(dia+" de Mayo de"+ano);
			break;
			
		case 6:
			System.out.println(dia+" de Junio de"+ano);
			break;
			
		case 7:
			System.out.println(dia+" de Julio de"+ano);
			break;
			
		case 8:
			System.out.println(dia+" de Agosto de"+ano);
			break;
			
		case 9:
			System.out.println(dia+" de Septiembre de"+ano);
			break;
			
		case 10:
			System.out.println(dia+" de Octubre de"+ano);
			break;
			
		case 11:
			System.out.println(dia+" de Nobiembre de"+ano);
			break;
			
		case 12:
			System.out.println(dia+" de Diciembre de"+ano);
			break;
		}

	}

}
