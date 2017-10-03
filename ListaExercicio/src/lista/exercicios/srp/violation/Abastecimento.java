package lista.exercicios.srp.violation;

public class Abastecimento  {


	private final int capacidadeTanqueCombustivel;
    protected int quantidadeCombustivel;
    
	public Abastecimento(int capacidadeTanque) {
		
		 this.capacidadeTanqueCombustivel = capacidadeTanque;
	        quantidadeCombustivel = capacidadeTanque;
	}
    
    public int getQuantidadeCombustivel() {
 		return quantidadeCombustivel;
 	}

 	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
 		this.quantidadeCombustivel = quantidadeCombustivel;
 	}

 	public int getCapacidadeTanqueCombustivel() {
 		return capacidadeTanqueCombustivel;
 	}
 	
	 
    public void reabastecimento(){
        quantidadeCombustivel = capacidadeTanqueCombustivel;
    }
}
