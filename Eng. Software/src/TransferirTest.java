import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransferirTest {
    @Test
    public void testTransferirBanco(){
        Transferir conta1 = new Transferir("12345", "Cleber", 1000.0);
        Transferir conta2 = new Transferir("54321", "Maria", 500.0);

        System.out.println("Saldo inicial da conta1: " + conta1.getSaldo());
        System.out.println("Saldo inicial da conta2: " + conta2.getSaldo());

        conta1.transferir(conta2, 300.0);

        System.out.println("Novo saldo da conta1: " + conta1.getSaldo());
        System.out.println("Novo saldo da conta2: " + conta2.getSaldo());

        assertEquals("12345", conta1.getNumeroConta());
        assertEquals("Cleber", conta1.getTitular());
        assertEquals(700.0, conta1.getSaldo(), 0.001); // 1000 - 300 = 700

        assertEquals("54321", conta2.getNumeroConta());
        assertEquals("Maria", conta2.getTitular());
        assertEquals(800.0, conta2.getSaldo(), 0.001); // 500 + 300 = 800
    }
}
