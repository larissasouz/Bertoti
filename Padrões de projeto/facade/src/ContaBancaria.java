public class ContaBancaria {
    private String conta;
    private int saldo;
    private String nomeCliente;

    public ContaBancaria(String conta, String nomeCliente) {
        this.conta = conta;
        this.nomeCliente = nomeCliente;
    }

    public int depositar(int valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public String obterNomeDoCliente() {
        return this.nomeCliente;
    }

    public int obterSaldo() {
        return this.saldo;
    }
}