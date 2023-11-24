import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    private Login sistemaLogin;

    @Before
    public void setUp() {
        sistemaLogin = new Login();
    }

    @Test
    public void testCadastrarUsuario() {
        sistemaLogin.cadastrarUsuario("usuario1", "senha123");
        assertTrue(sistemaLogin.autenticarUsuario("usuario1", "senha123"));
    }

    @Test
    public void testAutenticarUsuario() {
        sistemaLogin.cadastrarUsuario("usuario2", "senha456");
        assertTrue(sistemaLogin.autenticarUsuario("usuario2", "senha456"));
        assertFalse(sistemaLogin.autenticarUsuario("usuario2", "senhaerrada"));
    }
}
