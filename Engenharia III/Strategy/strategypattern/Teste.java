package strategypattern;

public class Teste {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		//	quero que joao fa�a um financiamento 12x
		joao.setFinanciamento(new FinanciamentoComum());
		joao.realizarFinanciamento();
		
		System.out.println("--------------------------------");
		
		// aqui � caso o jo�o quiser fazer um financiamento de 24x
		joao.setFinanciamento(new FinanciamentoEspecial());
		joao.realizarFinanciamento();
		
		
	}
	
}