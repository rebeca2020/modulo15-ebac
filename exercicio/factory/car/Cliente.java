package exercicio.factory.car;

public class Cliente {  //cadastro do cliente
	
	 private String particular;
	 private boolean empresarial;
	
	 public Cliente(String particular, boolean empresarial) {
		 
		 this.particular = particular;
		 this.empresarial = empresarial;
	 }


	public String getParticular() {
		return particular;
	}


	public boolean isEmpresarial() {
		return empresarial;
	}

}
