import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matrizes {
    public static void main(String[] args){
        //Matriz é uma tabela. um vetor de vetores. Possui linhas e colunas, enumeradas como um vetor.

        //Tamanho fixo
        //Dificuldade de inserções e deleções

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual o tamanho da matriz: ");
        int n = sc.nextInt();

        //Criando uma matriz. n por n:
        //Mesma coisa de um Array, so que com dois colchetes.
        //abaixo uma matriz quadrada
        int[][] matriz = new int[n][n];

        //OBS: O matriz[i].length abaixo diz respeito a quantidade de colunas

        //Percorrendo e adicionando elementos na matriz:
        for(int i = 0; i< matriz.length; i++) {
            System.out.println("Digite os dados da " + (i+1) + "º linha: ");
            for(int j = 0; j<matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        //Percorrendo e imprimindo os elementos da matriz:
        System.out.println("Sua matriz: ");
        for(int i = 0; i<matriz.length; i++) {
            for(int j = 0; j<matriz[i].length; j++) {
                //Imprimo abaixo os elementos sem pular de linha
                System.out.print(matriz[i][j] + " ");
            }
            //Imprimo abaixo uma quebra de linha para dar a impressão de matriz como resultado final:
            System.out.println();
        }

        System.out.println();

        //Percorrendo e imprimindo os elementos da DIAGONAL PRINCIPAL
        System.out.println("A Diagonal principal da matriz: ");
        for(int i = 0; i<matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        System.out.println();

        //Percorrendo e guardando os elementos NEGATIVOS:
        List<Integer> negativos = new ArrayList<>();

        for(int i = 0; i< matriz.length; i++) {
            for(int j = 0; j<matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    negativos.add(matriz[i][j]);
                }
            }
        }

        //Percorrendo e imprimindo os elementos NEGATIVOS:
        System.out.println("A matriz possui " + negativos.size() + " elemento(s) negativo(s): ");
        for (Integer negativo : negativos){
            System.out.println(negativo);
        }

        sc.close();
    }
}
