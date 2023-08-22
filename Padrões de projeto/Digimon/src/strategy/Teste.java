package strategy;

public class Teste {

		public static void main(String[] args) {
			
				Digimon anjemon = new Digimon();
				
				anjemon.setCategoria(new Anjo());
				
				anjemon.realizarCategoria();
				
				anjemon.setCategoria(new Serafim());
				
				anjemon.realizarCategoria(); 
			
				anjemon.setCategoria(new Diabo());
				
				anjemon.realizarCategoria();
				
		}
	
}
