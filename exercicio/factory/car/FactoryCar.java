package exercicio.factory.car;



public abstract class FactoryCar {  //TUDO QUE � COMUM PARA CRIAR UM CARRO. E O QUE N�O � COMUM, IMPLEMENTO EM ESPEC�FICO EM CADA F�BRICA.

	public Carro create(String pedido) {
		Carro carro = criarCarro(pedido);
		carro = comumCar(carro);
        return carro;
    }

	public Carro comumCar(Carro carro) {
		
		carro.getBluetooth();
		carro.getCor();
		carro.getQntPassageiro();
		
		return carro;
		
	}
	
	abstract Carro criarCarro(String pedido);
	
}
