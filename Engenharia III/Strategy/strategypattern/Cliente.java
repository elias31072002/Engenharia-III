package strategypattern;

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
