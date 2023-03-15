import java.util.Arrays;
import java.util.List;

public class TesteTransferenciaComSaldoExatamenteSuficiente {
    public static void main(String[] args) {
        // preparacao
        TestHelper testHelper = new TestHelper();
        ContaCorrente contaCorrente = new ContaCorrente(-1, -1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(-1, -1);

        // acao
        contaCorrente.transfere(100, contaPoupanca);

        // verificacao
        boolean testeSaldoDaContaQueTransferiuSaldo = contaCorrente.getSaldo() == 0;
        boolean testeSaldoDaContaQueRecebeuSaldo = contaPoupanca.getSaldo() == 200;
        List<Boolean> testes = Arrays.asList(testeSaldoDaContaQueTransferiuSaldo, testeSaldoDaContaQueRecebeuSaldo);
        testHelper.isAlgumTesteFalhou(testes);
    }
}
