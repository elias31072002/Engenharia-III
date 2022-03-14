package strategypattern;

public class Teste {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		//	quero que joao faça um financiamento 12x
		joao.setFinanciamento(new FinanciamentoComum());
		joao.realizarFinanciamento();
		
		System.out.println("--------------------------------");
		
		// aqui é caso o joão quiser fazer um financiamento de 24x
		joao.setFinanciamento(new FinanciamentoEspecial());
		joao.realizarFinanciamento();
		
		
	}
	
}