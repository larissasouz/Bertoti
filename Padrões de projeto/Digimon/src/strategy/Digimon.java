package strategy;

public class Digimon {
	
		private String nome;
		
		//Voo voo - se eu fizesse isso soh funcionaria com Voo
		//Nado nado - idem para nado
		
		private Categoria categoria; //Composicao
		
		public void setCategoria(Categoria cat) { //Argumento polimorfico!!!! Forma de Voo, forma de Nado e etc
			categoria = cat;
		}

		public void realizarCategoria() {
			categoria.categoria();
		}
		
}
