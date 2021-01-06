package es.studium.Impar;

import java.util.Scanner;

public class Impar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, i;
		System.out.print("Dame un número");
		numero1 = teclado.nextInt();
		System.out.print("Dame otro número");
		numero2 = teclado.nextInt();
		for(i=numero1;i<=numero2;i++)

			if(i%2!=0)

				System.out.println(i);

		teclado.close();

	}
}
