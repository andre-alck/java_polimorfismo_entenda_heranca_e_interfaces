public class Administrador extends Funcionario implements Autenticavel {
    int senha;

    public Administrador(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public int getSenha() {
        return this.senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
