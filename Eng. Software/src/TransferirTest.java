import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransferirTest {

    private Banco banco;
    private Cliente remetente;
    private Cliente destinatario;

    @Before
    public void setUp() {
        banco = new Banco("MeuBanco");
        remetente = new Cliente("João", banco, "12345", "João Silva", 1000.0);
        destinatario = new Cliente("Maria", banco, "54321", "Maria Oliveira", 500.0);
    }

    @Test
    public void testRealizarTransferenciaSaldoSuficiente() {
        // Configurar clientes com contas específicas para o teste
        ContaBancaria contaRemetente = new ContaBancaria("12345", "João Silva", 1000.0);
        ContaBancaria contaDestinatario = new ContaBancaria("54321", "Maria Oliveira", 500.0);
        remetente.setConta(contaRemetente);
        destinatario.setConta(contaDestinatario);

        // Realizar a transferência
        Transferir transferir = new Transferir(remetente, destinatario, 200.0);
        transferir.realizarTransferencia();

        // Verificar se a transferência foi realizada corretamente
        assertEquals(800.0, contaRemetente.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
        assertEquals(700.0, contaDestinatario.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
    }

    @Test
    public void testRealizarTransferenciaSaldoInsuficiente() {
        // Configurar clientes com contas específicas para o teste
        ContaBancaria contaRemetente = new ContaBancaria("12345", "João Silva", 1000.0);
        ContaBancaria contaDestinatario = new ContaBancaria("54321", "Maria Oliveira", 500.0);
        remetente.setConta(contaRemetente);
        destinatario.setConta(contaDestinatario);

        // Tentar realizar a transferência com saldo insuficiente
        Transferir transferir = new Transferir(remetente, destinatario, 1200.0);
        transferir.realizarTransferencia();

        // Verificar se a transferência não foi realizada e os saldos permanecem inalterados
        assertEquals(1000.0, contaRemetente.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
        assertEquals(500.0, contaDestinatario.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
    }
}
