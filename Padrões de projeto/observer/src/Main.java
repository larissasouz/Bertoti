public class Main {
    public static void main(String[] args) {
        Loteria loteria = new Loteria("Loteria 1", "123", "Mega-Sena");

        Jornal jornal = new Jornal();
        TV tv = new TV();

        loteria.addObservador(jornal);
        loteria.addObservador(tv);

        loteria.notificarObservadores();

        // Remover um observador
        loteria.remObservador(jornal);

        // Adicionar um novo observador
        TV novaTV = new TV();
        loteria.addObservador(novaTV);

        loteria.notificarObservadores();
    }
}