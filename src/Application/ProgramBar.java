package Application;

import java.util.Locale;
import java.util.Scanner;
import utilities.Bill;

public class ProgramBar {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill b = new Bill();
		
		System.out.print("SEXO: ");
		b.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de Cerveja: ");
		b.beer = sc.nextInt();
		
		System.out.print("Quantidade de Refrigerante: ");
		b.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de Espetinho: ");
		b.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = %.2f%n", b.feeding() );
		System.out.printf("Couvert = %.2f%n", b.cover() );
		System.out.printf("Ingresso = %.2f%n", b.ticket() );
		System.out.println();
		System.out.printf("Valor a Pagar = R$ %.2f%n", b.total());	
		
		sc.close();

	}

}
