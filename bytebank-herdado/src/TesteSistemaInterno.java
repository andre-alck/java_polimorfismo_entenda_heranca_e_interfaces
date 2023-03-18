import java.util.Arrays;
import java.util.List;

public class TesteSistemaInterno {
    public static void main(String[] args) {
        // preparacao
        String nome = "g";
        String cpf = "-1";
        double salario = -1.5;
        int senhaCorreta = -1;
        int senhaIncorreta = 0;

        TestHelper testHelper = new TestHelper();
        Gerente gerenteComSenhaCorreta = new Gerente(nome, cpf, salario, senhaCorreta);
        Gerente gerenteComSenhaIncorreta = new Gerente(nome, cpf, salario, senhaIncorreta);
        SistemaInterno sistemaInterno = new SistemaInterno();

        // acao
        boolean sistemaInternoAutenticaComSenhaCorretaTeste = sistemaInterno.autentica(gerenteComSenhaCorreta);
        boolean sistemaInternoAutenticaComSenhaIncorretaTeste = !sistemaInterno.autentica(gerenteComSenhaIncorreta);

        // verificacao
        List<Boolean> testes = Arrays.asList(sistemaInternoAutenticaComSenhaCorretaTeste, sistemaInternoAutenticaComSenhaIncorretaTeste);
        boolean isAlgumTesteFalhou = testHelper.isAlgumTesteFalhou(testes);
    }
}
