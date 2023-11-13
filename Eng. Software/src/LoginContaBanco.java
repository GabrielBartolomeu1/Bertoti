public class LoginContaBanco {

    private String nomeCorreto;
    private String senhaCorreta;

    public LoginContaBanco(String nomeCorreto, String senhaCorreta) {
        this.nomeCorreto = nomeCorreto;
        this.senhaCorreta = senhaCorreta;
    }

    public void realizarLogin(String nome, String senha) {
        if (nome.equals(nomeCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login feito com sucesso");
        } else {
            System.out.println("Nome ou senha incorretos");
        }
    }
}
