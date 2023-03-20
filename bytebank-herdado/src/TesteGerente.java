import java.util.Arrays;
import java.util.List;

public class TesteGerente {
    public static void main(String[] args) {
        String nome = "n";
        String cpf = "c";
        double salario = -1.5;
        Autenticador autenticador = new Autenticador();
        int senha = -1;
        Gerente gerente = new Gerente(nome, cpf, salario, senha, autenticador);

        boolean nomeTeste = gerente.getNome() == nome;
        boolean cpfTeste = gerente.getCpf() == cpf;
        boolean salarioTeste = gerente.getSalario() == salario;
        boolean senhaTeste = gerente.getAutenticador().getSenha() == senha;
        boolean bonificacaoTeste = gerente.getBonificacao() == 50;

        TestHelper testHelper = new TestHelper();
        List testes = Arrays.asList(nomeTeste, cpfTeste, salarioTeste, senhaTeste, bonificacaoTeste);
        boolean isAlgumTesteFalhou = testHelper.isAlgumTesteFalhou(testes);
    }
}
