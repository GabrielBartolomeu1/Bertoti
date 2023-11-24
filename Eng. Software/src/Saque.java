public class Saque {
    private Cliente cliente;
    private double valor;

    public Saque(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public void realizarSaque() {
        cliente.realizarSaque(valor);
    }

}
