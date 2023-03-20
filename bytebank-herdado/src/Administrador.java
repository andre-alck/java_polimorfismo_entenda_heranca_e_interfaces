public class Administrador extends Funcionario implements Autenticavel {
    private Autenticador autenticador;

    public Administrador(String nome, String cpf, double salario, int senha, Autenticador autenticador) {
        super(nome, cpf, salario);
        this.autenticador = autenticador;
        this.autenticador.setSenha(senha);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        boolean isAutenticado = autenticador.autentica(senha);
        return isAutenticado;
    }
}
