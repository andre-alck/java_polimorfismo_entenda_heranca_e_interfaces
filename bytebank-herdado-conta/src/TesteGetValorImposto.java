import java.util.Arrays;
import java.util.List;

public class TesteGetValorImposto {
    public static void main(String[] args) {
        // preparacao
        TestHelper testHelper = new TestHelper();
        CalculadorImposto calculadorImposto = new CalculadorImposto();

        // acao
        double valorDoImposto = calculadorImposto.getValorImposto();

        // verificacao
        boolean testeValorDoImpostoDeveSer1 = valorDoImposto == 1.0;
        List<Boolean> testes = Arrays.asList(testeValorDoImpostoDeveSer1);
        boolean isAlgumTesteFalhou = testHelper.isAlgumTesteFalhou(testes);
    }
}
