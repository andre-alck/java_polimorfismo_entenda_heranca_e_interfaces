public class SeguroDeVida implements Tributavel {
    private CalculadorImposto calculadorImposto;

    SeguroDeVida(CalculadorImposto calculadorImposto) {
        this.calculadorImposto = calculadorImposto;
    }

    @Override
    public double getValorImposto() {
        return calculadorImposto.getValorImposto();
    }
}
