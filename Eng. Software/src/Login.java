import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios; // Mapeia o nome do usuário para a senha

    public Login() {
        this.usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String nome, String senha) {
        usuarios.put(nome, senha);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    public boolean autenticarUsuario(String nome, String senha) {
        if (usuarios.containsKey(nome) && usuarios.get(nome).equals(senha)) {
            System.out.println("Login bem-sucedido. Bem-vindo, " + nome + "!");
            return true;
        } else {
            System.out.println("Falha na autenticação. Verifique seu nome de usuário e senha.");
            return false;
        }
    }

}
