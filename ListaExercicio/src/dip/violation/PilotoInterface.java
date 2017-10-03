package dip.violation;

public class PilotoInterface {

	private CarroDeCorrida veiculo;

	public PilotoInterface() {

	}

	public void aumentaVelocidade() {
		veiculo.acelerar();
	}

	public CarroDeCorrida getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(CarroDeCorrida veiculo) {
		this.veiculo = veiculo;
	}

}
