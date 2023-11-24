public class Transferir {
    private Cliente remetente;
    private Cliente destinatario;
    private double valor;

    public Transferir(Cliente remetente, Cliente destinatario, double valor) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valor = valor;
    }

    public void realizarTransferencia() {
        if (remetente.getConta().getSaldo() >= valor) {
            remetente.realizarSaque(valor);
            destinatario.realizarDeposito(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }

}
