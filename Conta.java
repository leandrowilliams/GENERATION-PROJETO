package Econogen;

import java.util.Scanner;

public class Conta {
	
	Scanner leia = new Scanner(System.in);
	
	
	private double saldo;
	double limite;
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		
		this.saldo = 100;
	}
	
	boolean sacar (double valor) {
		if (valor > saldo) {
			System.out.println("\nSaldo insuficiente");
			return false;
		}
		else 
		System.out.println("\nDigite o valor o saque");
		valor = leia.nextDouble();
		saldo = saldo - valor;
		System.out.println("\nSeu saldo é: " +saldo);
		return true;
	}
	
		void depositar (double valor) {
			System.out.println("\nDigite o valor de depósito");
			valor = leia.nextDouble();
			saldo = saldo + valor;
		}
		
		public void imprimirSaldo() {
			System.out.println("\nSeu saldo é " +saldo);
				
	}

}
