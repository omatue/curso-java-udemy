import java.util.Locale;
import java.util.Scanner;

import entities.Conversor_Exerc21;

public class Exerc21_Conversor {

	public static void main(String[] args) {
		/*Treino OOP. Pre�o do dolar em reais, quantidade a ser comprado, e o valor a ser pago em reais.*/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what is the dollar price?: ");
		
		double dolar = sc.nextDouble();
		
		System.out.print("Quantidade de dolar a ser comprado: ");
		
		double quantidade = sc.nextDouble();
		
		double valorConvertido = Conversor_Exerc21.conversor(dolar, quantidade);

	    System.out.printf("O valor que dever� ser pago � de R$ %.2f%n  ", valorConvertido);

	    sc.close();
	}

}