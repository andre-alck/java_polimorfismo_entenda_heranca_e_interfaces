public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSenha(123321);
        boolean autenticou = g1.autentica(123321);
        System.out.println(autenticou == true);
    }
}
