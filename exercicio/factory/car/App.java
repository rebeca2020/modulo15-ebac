package exercicio.factory.car;


public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("A", true);
		FactoryCar factory = getFactory(cliente);
		Carro carro = factory.create(cliente.getParticular()); //chamo para criar. Chamando a classe principal para todas.
		carro.passageiros();
	}

	private static FactoryCar getFactory(Cliente cliente) {
		
		if (cliente.isEmpresarial()) {
			return new ContratoEmpresarial();
		} else {
			return new SemContratoEmpresarial(); 
		}
	}

}
