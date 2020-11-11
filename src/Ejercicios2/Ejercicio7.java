package Ejercicios2;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,par=0,impar=0;
		for(int i=0;i<=100;i++) {
			System.out.println(i);
			if(i%2==0) {
				par=par+i;
			}else {
				impar=impar+i;
			}
			
		}
		System.out.println("La suma de los numeros pares son "+par);
		System.out.println("La suma de los numeros impares son "+impar);
	}

}
