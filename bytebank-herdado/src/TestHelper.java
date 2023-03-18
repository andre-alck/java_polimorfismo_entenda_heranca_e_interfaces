import java.util.List;

public class TestHelper {
    public boolean isAlgumTesteFalhou(List<Boolean> testes) {
        boolean isAlgumTesteFalhou = testes.contains(false);

        if(isAlgumTesteFalhou) {
            System.out.println("Um ou mais testes falharam.");
        } else {
            System.out.println("Todos os testes passaram.");
        }

        return isAlgumTesteFalhou;
    }
}
