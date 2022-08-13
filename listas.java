import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {
    public static void main(String[] args){
        //Listas: Diferente do vetor(ou array), uma lista não precisa ter inicialmente seu tamanho determinado.
        //Uma lista é dinamica.

        //É uma estrutura de dados homogenea(tudo do mesmo dado)
        //Ordenada, tem posições.
        //Inicia vazia, e elementos são alocados sob demanda.
        //Cada elemento ocupa um nó (ou nodo) da lista. Cada posição aponta para a proxima.

        //lista é o tipo List no java, é uma interface, não é java. E uma interface não pode ser instanciada.
        //Nesse caso, usamos classes que implementam essa interface, como: "ArrayList", "LinkedList", etc.
        //Mais facil para inserir e deletar.
        //Acesso sequencial(Navegar por varios até o que quero). Minimiza esse acesso usando o ArrayList.

        //Declarando um lista de numero inteiros:
        //Primeiro a palavra List, entre maior e menor o tipo(Wrapper class) e depois o nome da lista.
        //- - --  List<Integer> lista; - - -- -
        //Instanciação da lista:
        //Para instanciar eu uso o ArrayList.
        List<String> list = new ArrayList<>();

        //Adicionando um elemento na lista:
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Antonia");

        //Inserindo elementos numa determinada posição:
        //Abaixo estou adicionando o Luca na posição 2
        list.add(2, "Lucas");

        //Verificando o tamanho da lista:
        System.out.println(list.size());

        //Removendo um item da lista:
        //Posso remover um dado a partir da comparação:
        list.remove("Anna");
        //Removendo por indice:
        list.remove(1);

        //Usando for each para imprimir a lista:
        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");

        //Removendo por predicado(condição):
        //Ex: Pegue a inicial de cada elemento da lista(x) e me retorna se ele for igual a M. Retorna vdd ou falso.
        list.removeIf(x -> x.charAt(0) == 'M');
        //Comando acima removeu todos da lista que começam com a letra M

        //Usando for each para imprimir a lista:
        for (String nomes : list) {
            System.out.println(nomes);
        }

        //Encontrar a posição de um elemento;
        //A função abaixo encotra o Bob e retorna a posição dele.
        int posicao = list.indexOf("Bob");

        System.out.println("O Bob está na posição: " + posicao + " da lista.");
        //Abaixo um exemplo do que é retornado quando não encontramos algo na lista. Retorna -1
        System.out.println("Pessoa não encontrada na lista: " + list.indexOf("Marco"));

        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");

        //Filtrando minha lista para deixar nela somente as pessoas que começam com a letra L:
        //Abaixo me devolve uma nova lista stream filtrada com o predicado informado.
        //Stream não é compativel com list, preciso converter. Uso o collect:
        //Converto para stream(list.stream()), faço a lambda(.filter(x -> x.charAt(0) == 'L')) e volto ele para list(collectors)
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());

        for (String nomesL : resultado){
            System.out.println(nomesL);
        }

        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");

        //Como encontrar um elemento da lista com predicado:
        //EX: A primeira pessoa que começa com a letra A:
        //Quando numa string, uso mesmo conceito do filter e stram.
        //Me retorna um optional. pega o primeiro elemento da lista começando com A, se não existir retorna nulo.
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(nome);
    }
}
