package solopares2;

import java.util.Scanner;

public class solopares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un número");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		//se inicia en 1 para que no parta desde cero
		int contador = 0;	
		// variable contador solo aumentara en uno si valor es par
		// por lo tanto esatara en ciclo hasta que se cumpla con mostrar n pares
		while(contador < n){
			
            if (i % 2 == 0) {
                System.out.println(i);
                contador = contador +1;
		}
            i+=1;
		
		

		}
	}
}


