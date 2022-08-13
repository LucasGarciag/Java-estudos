import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {

        //Este programa captura e imprime na tela numeros negativos digitados
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        //Criando meu vetor:
        int[] numeros = new int[n];

        //Abaixo o for armazena cada numero digitado numa posição do vetor numeros[]
        for (int i=0; i< numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        //Abaixo verificando se o numero é negativo:
        for (int i=0; i< numeros.length; i++){
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
            }

        }

        sc.close();
    }
}
