public class Transferir extends ContaBancaria {

    public Transferir(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de " + valor + " realizada com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Transferência não realizada. Verifique o saldo e o valor informado.");
        }
    }
}
