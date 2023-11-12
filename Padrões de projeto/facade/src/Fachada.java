public class Fachada {
    private ContaBancaria conta;

    public Fachada(String nomeCliente, String numConta) {
        this.conta = new ContaBancaria(numConta, nomeCliente);
    }

    public void fazerDeposito(int quantidade) {
        System.out.printf(" \n Realizando depósito de R$ " + quantidade + " na conta de " + conta.obterNomeDoCliente());
        conta.depositar(quantidade);
        System.out.printf(" \n Saldo atual: R$ " + conta.obterSaldo());
    }
}