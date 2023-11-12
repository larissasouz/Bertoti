public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Depósito de Remédios
        DepRemedios depRemedios = new DepRemedios();

        // Criando uma instância de Dipirona
        Remedio dipirona = new Dipirona("Dipirona", "500mg", "Genérica");

        // Adicionando Dipirona ao Depósito de Remédios
        depRemedios.add(dipirona);

        // Criando uma instância de Dipirona
        Remedio dipironagts = new Dipirona("Dipirona", "gotas", "Genérica");

        // Adicionando Dipirona ao Depósito de Remédios
        depRemedios.add(dipironagts);

        // Inserindo todos os remédios no Depósito
        depRemedios.insert();
    }
}