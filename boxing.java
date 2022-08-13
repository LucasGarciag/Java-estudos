public class boxing {
    public static void main(String[] args) {
        //Tipo Object -> tipo classe.
        //Boxing: encaixotamento: atribui a uma variavel uma classe. ex:

        int x = 20;

        //Abaixo o boxing. Estou agora com meu obj do tipo classe referenciando a memoria do x
        Object obj = x;

        //Unboxing: desencaixotamento: Processo contrario ao de cima. Conversão de um objeto tipo referencia
        // para um objeto tipo valor compativel. Ex:
        //Nesse caixo abaixo, preciso fazer o casting.
        int y = (int) obj;
        //No exemplo acima foi criado um espaço na stack da memoria, em vez de uma referencia no heap.

        System.out.println(obj);

        //Wrapper classes:
        //Classes equivalentes aos tipos primitivos.
        //Para cada tipo primitivo existe um tipo classe. EX:

        //boolean -> Boolean
        //char -> Character
        //int -> Integer
        //byte -> Byte
        //short - > Short
        //long -> Long
        //float -> Float
        //double -> Double

        //Serve para que seja feito boxing e unboxing natural. No caso acima, eu poderia colocar no lugar
        //do Object um Integer

        //Geralmente usados em entidades. Herança, polimorfismo, etc. Aceitam null
        //Tipo primitivo não aceita nulo.





    }
}
