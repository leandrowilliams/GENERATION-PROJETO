package EcoGen;

import java.util.Scanner;

public class objetoCliente {

	public static void main(String[] args) {
		
		

		cliente clien1 = new cliente();	
		clien1.carrega();
		clien1.menu();
		/*clien1.qual();*/
		clien1.Nome();
		clien1.Idade();
		
	
		
		clien1.renda();
		clien1.TotalDespesas();
		//clien1.rendaMeses();
		clien1.sobraMensal();
		clien1.menuValorSonho();
		clien1.carrega();
		clien1.tipoSonho();
		clien1.carrega();
		clien1.valorSonho();
		clien1.opcoes();
		clien1.menufim();
		/*Jeffrey colocou como comentário, e criou método opcoes
		 * clien1.opcao1();
		clien1.opcao2();
		clien1.opcao3();*/
		
	/*	if(clien1.getRendaMensal()>20000)
	{
			System.out.println("\n" + clien1.getNomeCliente()+"\nParabens você alcançou seu objetivo");
	}
		else
	{
			System.out.println("\n"+clien1.getNomeCliente()+"\nInfelizmente Você mão alcançou seu objetivo");
	}*/}
		
	
	
}
