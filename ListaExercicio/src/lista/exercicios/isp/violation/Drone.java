package lista.exercicios.isp.violation;

public class Drone extends Veiculo {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }



	@Override
	public void ligar() {
		cameraOn = true;
	}

	@Override
	public void desligar() {
		cameraOn = false;
	}
}