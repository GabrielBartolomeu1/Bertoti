public class LoginContaBancoTest {

    public static void main(String[] args) {
        LoginContaBanco loginBanco = new LoginContaBanco("GabrielGuska", "Jorge123");


        loginBanco.realizarLogin("GabrielGuska", "Jorge123"); //Nome e senha corretos

        loginBanco.realizarLogin("Gabrielguska", "Cleber789"); // Nome e senha incorretos

        loginBanco.realizarLogin("gabrielguska", "Jorge123"); // Nome incorreto e senha correta

        loginBanco.realizarLogin("GabrielGuska", "Amilton532"); // Nome correto e senha incorreta
    }
}
