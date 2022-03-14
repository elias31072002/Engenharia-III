package strategypattern;


//O que eh um Design Pattern, ou Padrao de Projetos?
//Um Padrao de Projetos eh uma solucao arquitetural para resolver
//um problema comum

//Exemplo: Problema de duplicacao de codigo com a heranca (veja package antipattern)
//Solucao: Design Patter Strategy
//Definicao: o Strategy ele ***encapsula*** algoritmos (como o de emprestimo) e os
//torna ***intercambiaveis*** (para torna-los intercabiaveis, usa polimorfismo).


public class Cliente {

	private Financiamento financiamento; //aqui o polimorfismo
	
	public void setFinanciamento(Financiamento financiamento){//argumento polimorfico
		this.financiamento = financiamento;
	}
	
	public void realizarFinanciamento() {
		this.financiamento.financiar();
	}

	public void setFinanciamento(FinanciamentoComum financiamento2) {
		
		
	}


		
}
