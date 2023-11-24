import java.util.ArrayList;
import java.util.List;

public class Banco{
    private String nome;
    private List<ContaBancaria> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarConta(String numeroConta, String titular, double saldo) {
        ContaBancaria novaConta = new ContaBancaria(numeroConta, titular, saldo);
        contas.add(novaConta);
    }
}
