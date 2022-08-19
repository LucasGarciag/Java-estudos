package entidades;

//Abaixo estou usando a herança. Na qual eu herdo a classe Conta. A classe ContaTrabalho agora tem tudo que Conta tem
//Abaixo, a palavra final evita que a classe seja herdada
public final class ContaTrabalho extends Conta{

    //acrescentando as demais informações de ContaTrabalho, alem das que foram herdadas:
    private Double limiteEmprestimo;

    //construtor:
    public ContaTrabalho(){
        super();
    }

    //construtor com a palavra super, derivando da super classe(Conta):
    public ContaTrabalho(Integer number, String titular, Double saldo, Double limiteEmprestimo) {
        super(number, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor){
        if (valor <= limiteEmprestimo){
            //abaixo, para usar essa variavel saldo aqui na classe ContaTrabalho, devemos mudar o tipo de exposição
            //da variavel para protected, em vez de private. Private somente na propria classe. Protected: pode usar
            //em outra classe que seja uma subclasse, usa tmb na classe herdada.
            saldo += valor - 10.00;
        }
    }

    //Anotações:
    //Conta é uma generalização. É uma superclasse
    //ContaTrabalho é uma especialiazação. Algo mais especifico sobre Conta. É uma subclasse
    //Herança: extensão
    //Associação entre classes (não entre objetos)

    //Sobrepondo o metodo saque da classe conta:
    //Usando super:
    //Abaixo estou usando super porque a taxa de saque para a ContaTrabalho é igual da Conta + 2.0
    @Override
    public void saque(double valor){
        //Chamando o metodo saque da superclasse:
        super.saque(valor);
        saldo -= 2.0;
    }

}
