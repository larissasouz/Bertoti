class Dipirona implements Remedio {
    private String nome;
    private String dosagem;
    private String marca;

    public Dipirona(String nome, String dosagem, String marca) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.marca = marca;
    }

    @Override
    public void insert() {
        System.out.println("Inserindo Dipirona: " + nome + " - Dosagem: " + dosagem + " - Marca: " + marca);
    }
}