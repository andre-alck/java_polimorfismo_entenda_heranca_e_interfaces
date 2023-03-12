public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario andre = new Funcionario();
        andre.setSalario(100);

        double bonificacao = andre.getBonificacao();

        System.out.println(bonificacao == 10);
    }
}
