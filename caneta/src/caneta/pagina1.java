package caneta;

public class pagina1 {

	public static void main(String[] args) {
		caneta caneta1 = new caneta();
		caneta caneta2 = new caneta();
		
		caneta1.modelo ="amd";
		caneta1.cor= "azul";
		caneta1.ponta =0.5f;
		caneta1.carga = 200;
		caneta1.tampar(); 
		
		
		caneta1.status();
		caneta1.raspiscar();
		
		caneta2.modelo ="castel";
		caneta2.cor= "vermelha";
		caneta2.modelo ="castel";
		caneta2.ponta =0.6f;
		caneta2.destampar();
		
		caneta2.status();
		caneta2.raspiscar();
		
	}
	
	
	

}
