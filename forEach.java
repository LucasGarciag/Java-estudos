public class forEach {
    public static void main(String[] args) {
        //For each: sintaxe opicional e simplificada para percorrer coleções. Ex:

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        //For normal:
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("----------------------------------");

        //Usando for each:
        //Primeiro eu digo o tipo, depois um apelido, e por ultimo minha lista.
        //No caso abaixo, em vez de imprimir meu vetor na posição i, eu simplesmente coloco o apelido que dei.
        for(String nomes : vect){
            System.out.println(nomes);
        }

    }
}
