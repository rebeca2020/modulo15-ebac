package exercicio.factory.car;


public class ContratoEmpresarial extends FactoryCar {

	
	@Override
	Carro criarCarro(String pedido) {
		if ("B".equals(pedido)) {
            return new Corola("não possui bluetooth", "preto", 4);  //100 cavalos, tanque cheio e cor azul.
        } else {
            return new Volvo("possui bluetooth", "laranja", 2);
        }
	
	}
}
