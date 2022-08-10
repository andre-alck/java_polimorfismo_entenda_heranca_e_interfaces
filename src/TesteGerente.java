public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Noel");
        g1.setCpf("773.982.068-79");
        g1.setSalario(3000);
        g1.setSenha(123);

        System.out.println(g1.autentica(123));
    }
}
