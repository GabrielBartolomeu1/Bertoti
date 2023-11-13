import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositarTest {
    @Test
    public void testDepositarBanco() {
        Depositar conta = new Depositar("54321", "Maria", 200.0);

        assertEquals("54321", conta.getNumeroConta());
        assertEquals("Maria", conta.getTitular());
        assertEquals(200.0, conta.getSaldo(), 0.001);

        conta.depositar(300);
        assertEquals(500, conta.getSaldo(), 0.001); // Depósito feito com sucesso

        conta.depositar(-100);
        assertEquals(500, conta.getSaldo(), 0.001);  // Depósito falhou (valor negativo)

        conta.depositar(0);
        assertEquals(500, conta.getSaldo(), 0.001);  // Depósito falhou (valor nulo)


    }
}

