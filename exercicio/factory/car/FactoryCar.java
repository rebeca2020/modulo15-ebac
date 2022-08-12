package exercicio.factory.car;



public abstract class FactoryCar {  //TUDO QUE É COMUM PARA CRIAR UM CARRO. E O QUE NÃO É COMUM, IMPLEMENTO EM ESPECÍFICO EM CADA FÁBRICA.

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
