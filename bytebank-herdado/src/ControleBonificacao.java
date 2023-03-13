public class ControleBonificacao {
    private double bonificacao;

    public double getBonificacao() {
        return this.bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void registra(Funcionario funcionario) {
        double bonificacaoDoFuncionario = funcionario.getBonificacao();
        this.bonificacao += bonificacaoDoFuncionario;
    }
}
