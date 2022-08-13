import java.util.Scanner;

public class idadePessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai inserir? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        //Lendo e guardando as entradas do usuário:
        for (int i=0; i < n; i++){
            System.out.println("Digite os dados da " + (i+1) + "º pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        //Somando as alturas:
        double totalAlturas = 0;
        for (int i=0; i < n; i++){
            totalAlturas += alturas[i];
        }

        //Definindo a média das alturas:
        double media = totalAlturas / n;
        System.out.printf("Altura Média: %.2f%n", media);

        //Calculando a porcentagem de pessoas com menos de 16 anos:
        //for abaixo para contar quantas pessoas tem menos de 16 anos:
        int numPessDezesseisAnos = 0;
        for (int i=0; i < n; i++){
             if (idades[i] < 16){
                 numPessDezesseisAnos+=1;
             }
        }
        /*for abaixo para guardar os nomes das pessoas com menos de 16 anos:
        String[] nomesMenosDezesseisAnos = new String[numPessDezesseisAnos];
        int aux = 0;
        for (int i=0; i < n; i++){
            if (idades[i] < 16){
                nomesMenosDezesseisAnos[aux] = nomes[i];
                aux +=1;
            }
        }*/

        double porcentagem = (100/n) * numPessDezesseisAnos;

        //abaixo quando colocamos 2 %(porcentos) ele imprime um na tela:
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", porcentagem);
        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < n; i++){
            if (idades[i]< 16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
