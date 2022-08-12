package exercicio.factory.car;

public abstract class Carro {

	private String bluetooth;
	private String cor;
	private int qntPassageiro;
	
	

	public Carro(String bluetooth, String cor, int qntPassageiro) {

		this.bluetooth = bluetooth;
		this.cor = cor;
		this.qntPassageiro = qntPassageiro;
	}

	
	public void passageiros() {
		System.out.println(getClass().getSimpleName());
		System.out.println("A quantidade de passageiros do carro é de " + qntPassageiro + " pessoas." );
	}
	
	public void limpeza() {
		System.out.println("A cor" + cor.toLowerCase() + "do carro está linda, de tão brilhante. ");
		
	}
	
	public void mecanica() {
		System.out.println("Revisão do carro está em dia.");
	}
	
	public void multimidia() {
		System.out.println("No carro "+ bluetooth.toLowerCase() + "bluetooth." );
	}

	
	
//get e set


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQntPassageiro() {
		return qntPassageiro;
	}

	public void setQntPassageiro(int qntPassageiro) {
		this.qntPassageiro = qntPassageiro;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
}
