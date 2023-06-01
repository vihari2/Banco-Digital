import java.util.List;

public class Banco {
    private String nome;
    private String cnpj;
    private List<Conta> contas;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    public List<Conta> getContas() {
        return this.contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
