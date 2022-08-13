import java.util.Scanner;

public class ExercicioMatrizes {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        int n = sc.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        int m = sc.nextInt();

        //Declarando minha matriz:
        int[][] matriz = new int[n][m];

        //Iterando e recebendo os elementos da matriz:
        for (int i=0; i<matriz.length; i++){
            System.out.println("Digite os elementos da " + (i+1) + " linha: ");
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //Iterando e imprimindo a matriz:
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Logica para mostrar os elementos ao redor(esquerda, acima, direita, abaixo) de um elemento escolhido:
        System.out.println("Digite um elemento da matriz: ");
        int elemento = sc.nextInt();

        //Iterando e imprimindo a matriz:
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (elemento == matriz[i][j]){
                    System.out.println("Posição: " + i + ", " + j);
                    //Abaixo, colocando com try cath impede a parada com erro caso não exista um elemento vizinho
                    try{
                        System.out.println("Elemento à esquerda: " + matriz[i][(j-1)]);
                    }catch (Exception e){}

                    try{
                        System.out.println("Elemento acima: " + matriz[(i-1)][(j)]);
                    }catch (Exception e){}

                    try{
                        System.out.println("Elemento à direita: " + matriz[i][(j+1)]);
                    }catch (Exception e){}

                    try{
                        System.out.println("Elemento abaixo: " + matriz[(i+1)][(j)]);
                    }catch (Exception e){}
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
