package entities;

public class Conta {

    //portuguese version of the 'Account'
    //redoing the exercise to improve learning retention    private int numero;
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double depositoInicial) { //3 argumentos
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);//protegendo o construtor 'deposito' caso a regra de negocio do deposito
    }                             // mude no futuro, eu não preciso mudar aqui

    public Conta(int numero, String titular) { //2 argumentos
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantidade) {
        saldo += quantidade;
    }

    public void retirada(double quantidade) {
        saldo -= quantidade + 5.0;
    }

    public String toString() {
        return "Conta: "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
