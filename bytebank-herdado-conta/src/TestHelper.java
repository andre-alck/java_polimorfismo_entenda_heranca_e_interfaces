import java.util.List;

public class TestHelper {
    public boolean isAlgumTesteFalhou(List<Boolean> testes) {
        boolean isAlgumTesteFalhou = testes.contains(false);

        if (isAlgumTesteFalhou) {
            System.out.println("Houve falha nos testes.");
        } else {
            System.out.println("Todos os testes passaram.");
        }

        return isAlgumTesteFalhou;
    }
}
