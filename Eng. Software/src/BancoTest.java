import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BancoTest {

    @Test
    public void testAdicionarConta() {
        Banco banco = new Banco("MeuBanco");
        banco.adicionarConta("123", "Titular1", 1000.0);

        List<ContaBancaria> contas = banco.getContas();
        assertEquals(1, contas.size());

        ContaBancaria conta = contas.get(0);
        assertEquals("123", conta.getNumeroConta());
        assertEquals("Titular1", conta.getTitular());
        assertEquals(1000.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testGetNome() {
        Banco banco = new Banco("MeuBanco");
        assertEquals("MeuBanco", banco.getNome());
    }
}
