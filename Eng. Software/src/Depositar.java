public class Depositar extends ContaBancaria {

    public Depositar(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Por favor, insira um valor válido para depósito.");
        }
    }
}