/*
* Faça um programa em Java que mostre o nome e o salário dos funcionários que ganham
* acima da média salarial de uma empresa de n funcionários.
* O número n de funcionários deve ser informado pelo usuário!
*/
package aula13_09;
import java.util.Scanner;
public class ativ_salario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número de funcionários: ");
		int n = teclado.nextInt();
		teclado.nextLine();
		
		String[] nomes = new String[n];
		double[] salarios = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Informe o nome do funcionário " +(i + 1) + ": ");
			nomes[i] = teclado.nextLine();
			
			System.out.print("Informe o salário do funcionário " + (i + 1) + ": ");
			salarios[i] = teclado.nextDouble();
			teclado.nextLine();
		}
		double somaSalarios = 0;
		for (double salario : salarios) {
			somaSalarios += salario;
		}
		double mediaSalario = somaSalarios / n;

		System.out.println("\nFuncionários com salário acima da média:");
		for (int i = 0; i < n; i++) {
			if (salarios[i] > mediaSalario) {
				System.out.println("Nome: "+nomes[i]+", Salário: "+salarios[i]);
			}
			teclado.close();
		}
	}

}