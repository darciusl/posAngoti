package dip.violation;

public class Piloto {

   PilotoInterface pilotoInterface = new PilotoInterface();

    public Piloto(){
    	
    	pilotoInterface.setVeiculo(new CarroDeCorrida(100)); 
    }

   
}
