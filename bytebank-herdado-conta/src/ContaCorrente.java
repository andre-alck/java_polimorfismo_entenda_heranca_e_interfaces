public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        double saldoAtual = super.getSaldo();
        double novoSaldo = saldoAtual + valor;
        super.setSaldo(novoSaldo);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar= valor + 0.1;
        return super.saca(valorASacar);
    }
}
