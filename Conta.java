package Econogen;

import java.text.NumberFormat;
import java.util.Scanner;

public class Conta {
	
	Scanner leia = new Scanner(System.in);
	
	private double saldo;

	public Conta() 
	{
		this.saldo = 0;
	}
	
	void depositar (double valor) {
		valor = leia.nextDouble();
		saldo = saldo + valor;
	}
	
	void gasto (double valor) {
		
		valor = leia.nextDouble();
		saldo = saldo - valor;
	}	
		
	public void imprimirSaldo() {
		System.out.println("\nSeu saldo é de " +this.formatarMoeda() + " e você pode economizar o quanto você quiser deste valor");				
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldo);
		return formatoMoeda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
