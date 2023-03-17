public class ContaPoupanca extends Conta {
    ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double saldo) {
        double saldoAtual = super.getSaldo();
        double novoSaldo = saldoAtual + saldo;
        super.setSaldo(novoSaldo);
    }
}
