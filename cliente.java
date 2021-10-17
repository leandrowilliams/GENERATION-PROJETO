package EcoGen;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;



public class cliente {
	
	private String nomeCliente;
	private int idade;
	private double rendaMensal;
	private int meses;
	private float despesas;
	private double resto ;
	private double op1,op2,op3;
	private float sonho;
	private double parcelas;
	
	Scanner leia = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat();
	NumberFormat moeda = NumberFormat.getCurrencyInstance();
	
			
	public cliente()
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.rendaMensal = rendaMensal;
		this.resto = resto;
		this.despesas = despesas;
	}
	
	
	
	/*Deivide colocou como comentário
	 * public String formatarRenda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(getRendaMensal());
		return formatoMoeda;
	}
	public String formatarResto()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(getResto());
		return formatoMoeda;
	}*/
	
	public void menu()
	{
		System.out.println(" ============================== Seja Bem Vindo ao EconoGen ============================== \n\n");
		System.out.printf(""
				+ "\t ███████╗ ██████╗ ██████╗ ███╗   ██╗ ██████╗  ██████╗ ███████╗███╗   ██╗\r\n"
				+ "\t ██╔════╝██╔════╝██╔═══██╗████╗  ██║██╔═══██╗██╔════╝ ██╔════╝████╗  ██║\r\n"
				+ "\t █████╗  ██║     ██║   ██║██╔██╗ ██║██║   ██║██║  ███╗█████╗  ██╔██╗ ██║\r\n"
				+ "\t ██╔══╝  ██║     ██║   ██║██║╚██╗██║██║   ██║██║   ██║██╔══╝  ██║╚██╗██║\r\n"
				+ "\t ███████╗╚██████╗╚██████╔╝██║ ╚████║╚██████╔╝╚██████╔╝███████╗██║ ╚████║\r\n"
				+ "\t ╚══════╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝  ╚═════╝ ╚══════╝╚═╝  ╚═══╝                                            \n\n ");
		
		System.out.println("\n =========================================================================================");
		System.out.println("\n Com os seus OBJETIVOS você faz seus sonhos acontecerem.");
		System.out.println("\n É só dizer qual o seu SONHO e o VALOR que a gente calcula um prazo e diz o quanto da para guardar por mês.");
	}
	public void qual()
	{
		System.out.println("\nDeseja iniciar? \n 1-SIM |\n 2-NÃO ");
		 
	}
	
	public void Nome()
	{
		System.out.println("\nNome cliente :");
		nomeCliente = leia.nextLine();
	}
	
	
	
	public void Idade()
	{
		
		System.out.println("\nQual a sua idade :");
		idade = leia.nextInt();
		if(idade>=18 && idade<=70)
		{
			System.out.println("\nPode continuar o processo");
		}
		else if(idade<18)
		{
			System.out.println("\nVocê tem menos de 18 anos, portanto, não é possível continuar!");
			System.exit(0);
		}
		else
		{
			System.out.println("\nPessoas maiores de 70 anos não podem participar do processo!");
			System.exit(0);
		}
	}
	
	public void renda()
	{
		System.out.println("\nQual sua renda :");
		rendaMensal = leia.nextFloat();
	}
	
	public void TotalDespesas()
	{
		System.out.println("\nQual o valor total de despesas mensal:");
		despesas = leia.nextFloat();	
	}
	
	public void sobraMensal()
	{
		resto = rendaMensal - despesas;
		System.out.println("\nSeu saldo é de: "+moeda.format(resto));
		if(resto<=0)
		{
			System.out.println("\nNão sobrou dinheiro, por este motivo, não é possível continuar");
			System.exit(0);
		}
		else
		{
			System.out.println("\nVamos economizar para realizar seu sonho?");
		}
	}
	
	
	
	/*Jeffrey colocou como comentario
	 * public void rendaMeses()
	{
		System.out.println("\nQuantidade de meses :");
		meses = leia.nextInt();
		rendaMensal = rendaMensal*meses;
		System.out.println("\n"+nomeCliente+ " Tem uma renda de " + moeda.format(getRendaMensal()) + " em " +meses+ " meses");
		System.out.println("\n*************************************************************");
	}
	
	public void opcao1()
	{
		op1 = (resto * 50)/100;
		parcelas = sonho/op1;
		System.out.println("\nVocê tem a opção 1 de pegar 50 porcento do valor que te sobra mensalmente e dividr em "
		+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op1));
	}
	
	public void opcao2()
	{
		op2 = (resto * 75)/100;
		parcelas = sonho/op2;
		System.out.println("\nVocê tem a opção 2 de pegar 75 porcento do valor que te sobra mensalmente e dividr em "
		+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op2));
	}
	
	public void opcao3()
	{
		op3 = resto;
		parcelas = sonho/op3;
		System.out.println("\nVocê tem a opção 3 de pegar o valor total que sobra mensalmente e dividr em "
		+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op3));
	}
	*/
	
	//Jeffrey adicionou
		public void menuValorSonho()
		{
			int escolha;
			
				System.out.println("\nVocê deseja continuar? ");
				System.out.println("[1] SIM");
				System.out.println("[2] NÃO");
				escolha = leia.nextInt();
				if (escolha==1)
				{
					System.out.println("\nTudo bem, podemos continuar!");
				}
				else
				{
					System.out.println("\nAté a próxima!");
					System.exit(0);
				}

		}
		
		
		
		
	//adicionado pelo jeffrey
		public void tipoSonho()
		{
			int escolha;
				System.out.println("\nQual é o seu sonho ? ");
				System.out.println("\n1 - Automóvel");
				System.out.println("2 - Casa");
				System.out.println("3 - Casamento");
				System.out.println("4 - Viagem");
				System.out.println("5 - Pé de meia");
				escolha = leia.nextInt();
			if(escolha==1)
			{
				System.out.println("\nMuito bem, um automóvel é uma ótima escolha!");
			}
			else if(escolha==2)
			{
				System.out.println("\nUma escolha incrível, ter sua própria casa é uma meta maravilhosa!");
			}
			else if(escolha==3)
			{
				System.out.println("\nPara um casamento dos sonhos, é sempre melhor se preparar!");
			}
			else if(escolha==4)
			{
				System.out.println("\nAquela viagem incrível, que em breve você poderá desfrutar!");
			}
			else if(escolha==5)
			{
				System.out.println("\nFazer um pé de meia, é sempre importante!");
			}
			else
			{
				System.out.println("Escolha inválida!");
				System.out.println("\nEscolha uma das opções mostradas: \n1 - Automóvel \n2 - Casa \n3 - Casamento \n4 - Viagem \n5 - Pé de meia ");
				escolha = leia.nextInt();
				
			}
		}
		
		public void valorSonho()
		{
			System.out.println("\nQual o valor do seu sonho");
			sonho = leia.nextFloat();
			if(sonho <= resto)
			{
				System.out.println("Este processo não se aplica a você, pois você tem dinheiro o suficiente para pagar à vista");
				System.exit(0);
			}
			else
			{
				System.out.println("Parabéns!");
			}
		}
		
		//adicionado pelo Jeffrey
		public void opcoes(){
			int escolha;
			System.out.println("\nQual plano você gostaria de aderir ? ");
			System.out.println("\n1 - GenBasic (Sobra mais dinheiro no bolso, e seu sonho é realizado com o prazo mais longo)");
			System.out.println("2 - GenSilver (Sobra um pouquinho de dinheiro no bolso, e seu sonho é realizado em um prazo médio)");
			System.out.println("3 - GenGold (Não sobra dinheiro no bolso, mas seu sonho é realizado de forma super rápida, no prazo curto)");
			escolha = leia.nextInt();
			
			int escolhaop;
			
			System.out.println("\nTem certeza que deseja escolher este plano? ");
			System.out.println("[1] SIM");
			System.out.println("[2] NÃO");
			escolhaop = leia.nextInt();
			
			if (escolhaop==1)
			{
				System.out.println("\nParabéns pela escolha incrível!");
			}
			else
			{
				System.out.println("Que pena que você não gostou, gostaria de selecionar outro plano ?");
				System.out.println("\n1 - GenBasic (Sobra mais dinheiro no bolso, e seu sonho é realizado com o prazo mais longo)");
				System.out.println("2 - GenSilver (Sobra um pouquinho de dinheiro no bolso, e seu sonho é realizado em um prazo médio)");
				System.out.println("3 - GenGold (Não sobra dinheiro no bolso, mas seu sonho é realizado de forma super rápida, no prazo curto)");
				escolha = leia.nextInt();
			}
			
			if(escolha==1)
			{
				op1 = (resto * 50)/100;
				parcelas = sonho/op1;
				System.out.println("\nVocê escolheu o plano GenBasic, e com isso você pode pagar "
				+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op1) +" para realizar o seu sonho!" );
			}
			
			else if(escolha ==2)
			{
				op2 = (resto * 75)/100;
				parcelas = sonho/op2;
				System.out.println("\n\nVocê escolheu o plano GenSilver, e com isso você pode pagar "
				+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op2) +" para realizar o seu sonho!");
			}
			else if(escolha ==3)
			{
				op3 = resto;
				parcelas = sonho/op3;
				System.out.println("\n\nVocê escolheu o plano GenGold, e com isso você pode pagar "
				+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op3) +" para realizar o seu sonho!");
			}
			else
			{
				System.out.println("Escolha inválida!");
				System.out.println("\nEscolha uma das opções mostradas: \n1 - GenBasic \n2 - Casa \n3 - GenSilver \n4 - GenGold");
				escolha = leia.nextInt();
				
			}
		}
	
	public float getDespesas() {
		return despesas;
	}

	public void setDespesas(float despesas) {
		this.despesas = despesas;
	}

	public double getResto() {
		return resto;
	}

	public void setResto(float resto) {
		this.resto = resto;
	}

	public String getNomeCliente() 
	{
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getRendaMensal() {
		return rendaMensal;
	}


	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
