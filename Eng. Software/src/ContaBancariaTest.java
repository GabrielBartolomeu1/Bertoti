import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaBancariaTest {

    @Test
    public void testExibirInformacoes() {
        ContaBancaria conta = new ContaBancaria("12345", "Titular1", 1000.0);

        String expectedOutput = "Número da Conta: 12345\nTitular: Titular1\nSaldo: R$ 1000.0";
        assertEquals(expectedOutput, getContaInformacoes(conta));
    }

    @Test
    public void testDepositar() {
        ContaBancaria conta = new ContaBancaria("12345", "Titular1", 1000.0);
        conta.depositar(500.0);

        assertEquals(1500.0, conta.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
    }

    @Test
    public void testSacar() {
        ContaBancaria conta = new ContaBancaria("12345", "Titular1", 1000.0);
        conta.sacar(200.0);

        assertEquals(800.0, conta.getSaldo(), 0.001); // Delta de 0.001 para comparação de ponto flutuante
    }

    private String getContaInformacoes(ContaBancaria conta) {
        return "Número da Conta: " + conta.getNumeroConta() +
                "\nTitular: " + conta.getTitular() +
                "\nSaldo: R$ " + conta.getSaldo();
    }
}
