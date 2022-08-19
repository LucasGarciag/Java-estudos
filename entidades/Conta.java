package entidades;

public class Conta {
    private Integer number;
    private String titular;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer number, String titular, Double saldo) {
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    //Tirei o set do saldo para proteger o mesmo.
    //Abaixo as funcionalidades de saque e deposito
    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    //Abaixo, o final evita que o metodo seja sobreposto, como é o caso do metodo acima, sobreposto em ContaPoupanca
    //e ContaTrabalho
    public final void deposito(double valor){
        saldo += valor;
    }
}
