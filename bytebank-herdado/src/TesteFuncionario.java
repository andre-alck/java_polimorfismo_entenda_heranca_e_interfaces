import java.util.Arrays;
import java.util.List;

public class TesteFuncionario {
    public static void main(String[] args) {
        String nome = "n";
        String cpf = "c";
        double salario = -1.5;
        Funcionario andre = new Funcionario(nome, cpf, salario);

        boolean nomeTeste = andre.getNome() == nome;
        boolean cpfTeste = andre.getCpf() == cpf;
        boolean salarioTeste = andre.getSalario() == salario;
        boolean bonificacaoTeste = andre.getBonificacao() == andre.getSalario() * 0.1;

        TestHelper testHelper = new TestHelper();
        List testes = Arrays.asList(nomeTeste, cpfTeste, salarioTeste, bonificacaoTeste);
        boolean isAlgumTesteFalhou = testHelper.isAlgumTesteFalhou(testes);
        System.out.println("Algum teste falhou: " + isAlgumTesteFalhou);
    }
}

