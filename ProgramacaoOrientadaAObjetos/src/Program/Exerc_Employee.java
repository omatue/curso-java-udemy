package Program;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exerc_Employee {
	
	/*Treino OOP. criar o nome de um funcionario, seu salario bruto, e uma taxa, e depois adicionar
	 *  uma porcentagem ao salario*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funci = new Employee();
		
		System.out.println("Nome: ");
		funci.nome = sc.next();
		System.out.println("Salario bruto: ");
		funci.salariomax = sc.nextDouble();
		System.out.println("Taxa: ");
		funci.taxa = sc.nextDouble();
		
		System.out.println("Employee: " + funci);
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		funci.increaseSalary(percentage);
		
		System.out.println("Updated data: " + funci);
		
		sc.close();
		

	}

}
