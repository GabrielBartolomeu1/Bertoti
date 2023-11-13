import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SacarTest {
    @Test
    public void testSacarBanco() {
        Sacar conta = new Sacar("12345", "Cleber", 1000.0);

        assertEquals("12345", conta.getNumeroConta());
        assertEquals("Cleber", conta.getTitular());
        assertEquals(1000.0, conta.getSaldo(), 0.001);

        conta.sacar(400);
        assertEquals(600, conta.getSaldo(), 0.001); // Saque feito com sucesso

        conta.sacar(700);
        assertEquals(600, conta.getSaldo(), 0.001); // Saldo insuficiente, saldo não deve mudar
    }
}
