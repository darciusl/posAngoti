package lista.exercicios.srp.violation;

public  class Veiculo extends Abastecimento {

	
   
    
	public Veiculo(int capacidadeTanque) {
		super(capacidadeTanque);
		 quantidadeCombustivel = capacidadeTanque;
	}
 

    public void acelerar() {
        quantidadeCombustivel--;
    }
}
