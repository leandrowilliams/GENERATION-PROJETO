<<<<<<< HEAD
package projetogen;
=======
package EcoGen;
>>>>>>> 34ceb18bd8b07fc48d54601817ac1a9e7382bdb4

import java.util.Scanner;

public class Econogem {

	public static void main(String[] args) {
		// menu
		
		Menu menu=new Menu();
		
		Scanner sc = new Scanner(System.in);
		int opcao, objetivo, idade, perfil;
		String nome;
		Double renda;
		
		System.out.println(" ============ Seja Bem Vindo ao EconoGen ============ ");
		System.out.println("\nCom os seus OBJETIVOS voc� faz seus sonhos acontecerem.");
		System.out.println("\n� s� dizer qual o seu SONHO e o VALOR que a gente calcula um prazo e diz o quanto da para guardar por m�s.");
		
		System.out.println("\nDeseja iniciar? \n 1-SIM |\n 2-N�O ");
		opcao = sc.nextInt();
		while(opcao == 1) {
			System.out.print("\nDigite seu nome: ");
			nome = sc.next();
			System.out.printf("\nOl�, %s! Vamos come�ar?%n",nome);
			System.out.print("\nQual sua idade? ");
			idade = sc.nextInt();
			if(idade >= 18) {
				System.out.print("\nQual sua renda atual em reais: ");
				renda = sc.nextDouble();
			}
				else {
				System.out.println("nao pode ter uma conta em nosso App");
				}	
			
				
				
				
				sc.close();

	}}}


