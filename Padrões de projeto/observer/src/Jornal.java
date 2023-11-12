class Jornal implements Observer {
    @Override
    public void update(String nome, String numero, String tipo) {
        System.out.println("Jornal: Nova informação da loteria - Nome: " + nome + ", Número: " + numero + ", Tipo: " + tipo);
    }

    public void jornalMethod() {
        System.out.println("Método específico do Jornal");
    }
}