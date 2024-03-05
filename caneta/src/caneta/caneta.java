package caneta;

public class caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampa;
	
	
	void status (){
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("o modelo é "+ this.modelo);	
		System.out.println("A cor é " +this.cor);
		System.out.println("o Tamanho da ponta é "+ this.ponta);
		System.out.println("A quantidade de carga é  " + this.carga);
		System.out.println("A caneta está tampada " + this.tampa);
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
	
	void raspiscar () {
		if (this.tampa = true) {
		
			System.out.println("ERRO, não pode rabiscar ");
		}else {
			
			System.out.println("Pode rabiscar ");
		}
	}
	
	
	
	void tampar() {
	 this.tampa = true;
	}

	void destampar () {
	this.tampa=false;
	}
	
}
