public class Cliente {
    private String nome;
    private Banco banco;
    private ContaBancaria conta;

    public Cliente(String nome, Banco banco, String numeroConta, String titular, double saldo) {
        this.nome = nome;
        this.banco = banco;
        this.conta = new ContaBancaria(numeroConta, titular, saldo);
        banco.adicionarConta(numeroConta, titular, saldo);
    }

    public String getNome() {
        return nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public void realizarDeposito(double valor) {
        conta.depositar(valor);
    }

    public void realizarSaque(double valor) {
        conta.sacar(valor);
    }

    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome);
        System.out.println("Banco: " + banco.getNome());
        conta.exibirInformacoes();
    }

}
