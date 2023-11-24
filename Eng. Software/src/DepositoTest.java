import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositoTest {

    @Test
    public void testRealizarDeposito() {
        Banco banco = new Banco("MeuBanco");
        ContaBancaria conta = new ContaBancaria("12345", "Titular1", 1000.0);
        Cliente cliente = new Cliente("João", banco, "54321", "João Silva", 500.0);

        // Configurar a conta bancária para o cliente
        cliente.setConta(conta);

        Deposito deposito = new Deposito(cliente, 300.0);
        deposito.realizarDeposito();

        assertEquals(1300.0, conta.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
    }
}
