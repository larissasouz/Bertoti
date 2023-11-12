public class Singleton {

    private static Singleton instanciaUnica;

    private Singleton() {}

    public static synchronized Singleton getInstance() {

        if (instanciaUnica == null)
            instanciaUnica = new Singleton();

        return instanciaUnica;
    }

    public static void main(String args[]) {
        Singleton unicaInstancia1 = Singleton.getInstance();
        System.out.println(unicaInstancia1);
    }
}
