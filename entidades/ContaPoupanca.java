package entidades;

//Abaixo, a palavra final evita que a classe seja herdada
public final class ContaPoupanca extends Conta{

    private Double juros;

    //Construtor padrão
    public ContaPoupanca() {
        super();
    }

    //Construtor com argumentos
    public ContaPoupanca(Integer number, String titular, Double saldo, Double juros) {
        super(number, titular, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    //Atualizar o saldo com base numa taxa de juros
    public void atualizarConta(){
        saldo += saldo * juros;
    }

    //Abaixo estou usando sobreposição de metodos, usando o mesmo metodo da classe Conta.
    //A anotação @Override é especifica para sobreposição de metodos.
    @Override
    public void saque(double valor){
        saldo -= valor;
    }

}
