package lista.exercicios.isp.violation;

public class Carro extends Veiculo  {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

	@Override
	public void ligar() {
		radioOn = true;
	}

	@Override
	public void desligar() {
        radioOn = false;
	}

}