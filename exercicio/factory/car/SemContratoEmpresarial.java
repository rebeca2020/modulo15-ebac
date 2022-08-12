package exercicio.factory.car;

public class SemContratoEmpresarial extends FactoryCar {

	@Override
	Carro criarCarro(String pedido) {

		if ("A".equals(pedido)) {
			return new Porsche("n�o possui bluetooth", "preto ", 4);
		} else {
			return new Jaguar("possui bluetooth", "laranja", 2);
		}

	}

}
