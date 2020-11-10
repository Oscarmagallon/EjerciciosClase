package Ejercicios0;

public class Ejercicio18 {

	public static void main(String[] args) {
		int cont=0,num=100;
		while(num>0) {
			if(num%2==0 || num%3==0) {
				cont=cont+1;
			}
			num--;
		}
		System.out.println(cont);
	}

}
