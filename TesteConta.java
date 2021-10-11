package Econogen;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		//double valor;
		{
			
			System.out.println("Insira o valor do seu salário: ");
			conta1.depositar(conta1.getSaldo());
				
			System.out.println("Insira o valor do seu gasto fixo mensal: " );
			conta1.gasto(conta1.getSaldo());
			
			conta1.imprimirSaldo();
			}
		}
}

