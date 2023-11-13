public class Sacar extends ContaBancaria {

    public Sacar(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
