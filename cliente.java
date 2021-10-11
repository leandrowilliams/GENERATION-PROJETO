package POO;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class cliente {
	
	private String nomeCliente;
	private int idade;
	private float rendaMensal;
	private int meses;
	private float despesas;
	private float resto ;
	private float op1,op2,op3;
	private float sonho;
	private float parcelas;
	
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
	
	/*public String formatarRenda()
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
	
	public void TotalDespesas()
	{
		System.out.println("\nQual o valor total de despesas mensal:");
		despesas = leia.nextFloat();	
	}
	
	public void sobraMensal()
	{
		resto = rendaMensal - despesas;
		System.out.println("resto mensal : "+moeda.format(resto));
	}
	public void Nome()
	{
		System.out.println("\nNome cliente :");
		nomeCliente = leia.nextLine();
	}
	
	public void renda()
	{
		System.out.println("\nQual sua renda :");
		rendaMensal = leia.nextFloat();
	}
	
	public void Idade()
	{
		System.out.println("\nQual a sua idade :");
		idade = leia.nextInt();
	}
	
	public void rendaMeses()
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
	
	public void valorSonho()
	{
		System.out.println("\nQual o valor do seu sonho");
		sonho = leia.nextFloat();
	}
	
	public float getDespesas() {
		return despesas;
	}

	public void setDespesas(float despesas) {
		this.despesas = despesas;
	}

	public float getResto() {
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


	public float getRendaMensal() {
		return rendaMensal;
	}


	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
