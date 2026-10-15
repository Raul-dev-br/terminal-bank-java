public class Conta {
    private final int numero;
    private final Cliente titular;
    private double saldo;

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor <= 0.0) return;
        saldo += valor;
    }

    public boolean sacar(double valor){
        if(valor <= 0.0 || valor > saldo) return false;
        saldo -= valor;
        return true;
    }
}
