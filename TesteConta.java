package Econogen;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Conta conta1 = new Conta();
		//double valor;
		
		int resposta = 1;
		
		while (resposta == 1) {
			
			int opcao;
			
			System.out.println("Escolha uma das opções: ");
			System.out.println("[1] Saque" );
			System.out.println("[2] Saldo" );
			System.out.println("[3] Depósito" );
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				conta1.sacar(conta1.getSaldo());
				break;
				
			case 2:
				conta1.imprimirSaldo();
				break;
				
			case 3:
				conta1.depositar(conta1.getSaldo());
				break;
				
				default:
					System.out.println("Opção inválida!");
			}
			System.out.println("\nDeseja realizar outra operação? \n[SIM] Digite 1 ------ [NÃO] Digite qualquer tecla");
			resposta = leia.nextInt();
			if (resposta != 1) {
				System.out.println("Finalizando");
			}
		}

	}

}
