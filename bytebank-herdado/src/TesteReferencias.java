import java.util.Arrays;
import java.util.List;

public class TesteReferencias {
    public static void main(String[] args) {
        String nome = "a";
        String cpf = "a";
        double salario = -1.5;
        Autenticador autenticador = new Autenticador();
        int senha = -1;

        EditorDeVideo editorDeVideo = new EditorDeVideo(nome, cpf, salario);
        Designer designer = new Designer(nome, cpf, salario);
        Gerente gerente = new Gerente(nome, cpf, salario, senha, autenticador);
        ControleBonificacao controleBonificacao = new ControleBonificacao();
        TestHelper testHelper = new TestHelper();

        controleBonificacao.registra(editorDeVideo);
        controleBonificacao.registra(designer);
        controleBonificacao.registra(gerente);

         boolean controleBonificacaoTeste = controleBonificacao.getBonificacao() == editorDeVideo.getBonificacao() + designer.getBonificacao() + gerente.getBonificacao();


        List testes = Arrays.asList(controleBonificacaoTeste);
        boolean isAlgumTesteFalhou = testHelper.isAlgumTesteFalhou(testes);
    }
}
