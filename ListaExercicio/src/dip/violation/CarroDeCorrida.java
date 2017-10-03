package dip.violation;

public class CarroDeCorrida extends CarroDeCorridaInterface {

	CarroDeCorridaInterface CarroDeCorrida = new CarroDeCorridaInterface();
	
    public CarroDeCorrida(final int combustivel) {
    	
    	
    	CarroDeCorrida.setCapacidadeTanqueCombustivel(combustivel);
    	CarroDeCorrida.setQuantidadeCombustivel(combustivel);
      
    }

    public void acelerar(){
    	
    	int potencia = CarroDeCorrida.getQuantidadeCombustivel();
    	int acelera = potencia++;
    	int quantidadeCombustivel = CarroDeCorrida.getQuantidadeCombustivel();
    	int quantidade = quantidadeCombustivel--;
    	CarroDeCorrida.setPotencia(acelera);
    	CarroDeCorrida.setQuantidadeCombustivel(quantidade);
        
    }

}