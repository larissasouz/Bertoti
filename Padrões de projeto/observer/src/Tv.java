class TV implements Observer {
    @Override
    public void update(String nome, String numero, String tipo) {
        System.out.println("TV: Nova informação da loteria - Nome: " + nome + ", Número: " + numero + ", Tipo: " + tipo);
    }

    public void tvMethod() {
        System.out.println("Método específico da TV");
    }
}