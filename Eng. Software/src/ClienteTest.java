import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void testExibirInformacoes() {
        Banco banco = new Banco("MeuBanco");
        Cliente cliente = new Cliente("João", banco, "12345", "João Silva", 1000.0);

        String expectedOutput = "Cliente: João\nBanco: MeuBanco\nNúmero da Conta: 12345\nTitular: João Silva\nSaldo: R$ 1000.0";
        assertEquals(expectedOutput, getClienteInformacoes(cliente));
    }

    private String getClienteInformacoes(Cliente cliente) {
        return "Cliente: " + cliente.getNome() +
                "\nBanco: " + cliente.getBanco().getNome() +
                "\n" + getContaInformacoes(cliente.getConta());
    }

    private String getContaInformacoes(ContaBancaria conta) {
        return "Número da Conta: " + conta.getNumeroConta() +
                "\nTitular: " + conta.getTitular() +
                "\nSaldo: R$ " + conta.getSaldo();
    }
}
