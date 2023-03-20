public class Gerente extends Funcionario implements Autenticavel {
    private Autenticador autenticador;

    public Gerente(String nome, String cpf, double salario, int senha, Autenticador autenticador) {
        super(nome, cpf, salario);
        this.autenticador = autenticador;
        this.autenticador.setSenha(senha);
    }

    public Autenticador getAutenticador() {
        return this.autenticador;
    }


    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public boolean autentica(int senha) {
        boolean isAutenticado = this.autenticador.autentica(senha);
        return isAutenticado;
    }
}