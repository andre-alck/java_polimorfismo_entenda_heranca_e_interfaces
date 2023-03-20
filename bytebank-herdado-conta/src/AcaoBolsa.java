public class AcaoBolsa implements Tributavel {
    private CalculadorImposto calculadorImposto;

    public AcaoBolsa(CalculadorImposto calculadorImposto) {
        this.calculadorImposto = calculadorImposto;
    }

    @Override
    public double getValorImposto() {
        return calculadorImposto.getValorImposto();
    }
}
