import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaqueTest {

    private Banco banco;
    private Cliente cliente;

    @Before
    public void setUp() {
        banco = new Banco("MeuBanco");
        cliente = new Cliente("João", banco, "12345", "João Silva", 1000.0);
    }

    @Test
    public void testRealizarSaque() {
        // Configurar o cliente com uma conta específica para o teste
        ContaBancaria conta = new ContaBancaria("12345", "João Silva", 1000.0);
        cliente.setConta(conta);

        // Realizar o saque
        Saque saque = new Saque(cliente, 200.0);
        saque.realizarSaque();

        // Verificar se o saldo foi atualizado corretamente
        assertEquals(800.0, conta.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
    }
}
