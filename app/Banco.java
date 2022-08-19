package app;

import entidades.Conta;
import entidades.ContaPoupanca;
import entidades.ContaTrabalho;

public class Banco{
        public static void main (String[] args) {

                Conta conta = new Conta(1001, "Lucas", 0.0);
                ContaTrabalho contaTrabalho = new ContaTrabalho(1002, "Maria", 0.0, 500.0);

                //Upcasting: pegar um objeto do tipo ContaTrabalho(subclasse) e atribuir para Conta(Superclasse):
                Conta conta1 = contaTrabalho;
                //Acima não dá erro pq é uma conta tmb.

                Conta conta2 = new ContaTrabalho(1003, "Bob", 0.0, 200.0);

                Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);


                //Downcasting: converter um objeto da superclasse para subclasse
                //Abaixo da erro, pois a conta2 é do tipo Conta, não do tipo ContaTrabalho.
                //-- ContaTrabalho conta4 = conta2; --//
                //Preciso então fazer um casting. Coloco entre parenteses o tipo da classe:
                ContaTrabalho conta4 = (ContaTrabalho)conta2;
                //Realizando um emprestimo no valor de 100 por exemplo:
                conta4.emprestimo(100.0);

                //Abaixo gera um erro na hora de rodar o programa, pois a classe ContaPoupanca é uma Conta
                //mas não é uma ContaTrabalho. Não conseguiu fazer a conversão
                // -- ContaTrabalho conta5 = (ContaTrabalho)conta3; -- //
                //O programa não sabe que não vai conseguir converter, vai do programador ficar ligado.
                //Como testar:
                //Tradução: se o objeto de conta3 for uma instancia de ContaTrabalho:
                if (conta3 instanceof ContaTrabalho){
                        //Nesse caso esse if não irá rodar, o conta3 é do tipo poupanca
                        ContaTrabalho conta5 = (ContaTrabalho)conta3;
                        conta5.emprestimo(200.0);
                        System.out.println("Emprestado!");
                }

                //Outra verificação:
                if (conta3 instanceof ContaPoupanca){
                        ContaPoupanca conta5 = (ContaPoupanca)conta3;
                        conta5.atualizarConta();
                        System.out.println("Atualizado");
                }

                //Sobreposição ou sobrescrita:
                //quando eu implemento um metodo da superclasse na subclasse. Ex:
                //Implementar o metodo depositar na ContaPoupanca tambem.
                //Fortemente recomendado usar @Override em um metodo sobreposto
                //Abaixo exemplos:

                //Verificando a taxa de saque, que para conta normal é de 5 e conta poupança não tem:
                Conta conta6 = new Conta(1005, "João", 1000.0);
                conta6.saque(200.0);
                System.out.println(conta6.getSaldo());

                //Abaixo exemplo de polimorfismo, variaveis de um mesmo tipo apontando para objetos diferentes.

                Conta conta07 = new ContaPoupanca(1006, "Zilene", 1000.0, 0.01);
                conta07.saque(200.0);
                System.out.println(conta07.getSaldo());
                //No exemplo acima, podemos ver que não foi descontado o valor de 5, por ser uma conta poupanca

                //Super: utilizei o comando super para recuperar o metodo saque da superclasse Conta em ContaTrabalho
                //para poder implementar a logica de que a taxa de saque para a ContaTrabalho é igual a Conta(5.0) + 2.0
                //Testando:
                Conta conta8 = new ContaTrabalho(1007, "Bilu", 1000.0, 500.0);
                conta8.saque(200.0);
                System.out.println(conta8.getSaldo());

        }
}
