public class Deposito {
    private Cliente cliente;
    private double valor;

    public Deposito(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public void realizarDeposito() {
        cliente.realizarDeposito(valor);
    }

}
