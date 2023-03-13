public class Designer extends Funcionario{
    Designer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao() {
        double quantidadeDeLetrasNoNomeDoDesigner = this.getNome().length();
        return quantidadeDeLetrasNoNomeDoDesigner * 100;
    }
}
