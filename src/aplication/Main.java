package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Metod;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de v�deos: ");
		int contvideos = sc.nextInt();
		System.out.print("Pre�o: $");
		double price = sc.nextDouble();
		Metod met = new Metod(contvideos, price);
		
		System.out.println();
		System.out.println(met.toString());
		
		sc.close();
	}
}
