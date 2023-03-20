public class SistemaInterno {
    private int senha = -1;

    public boolean autentica(Autenticavel autenticavel) {
        boolean isAutenticado = autenticavel.autentica(senha);

        if(isAutenticado) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado.");
        }

        return isAutenticado;
    }
}
