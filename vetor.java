import java.util.Scanner;

public class vetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de entrada que irá fazer: ");
        int n = sc.nextInt();

        //criando um vetor(array):
        //Primeiro o tipo acompanhado de colchetes, dps o nome, e a instanciação seguido do tipo e a quantidade.
        //OBS: quando eu coloco n indica que não tem tamanho definido.
        double[] vect = new double[n];

        //fazer um for para alocar valores no array
        for (int i=0;i<n; i++){
            vect[i] = sc.nextDouble();
        }

        //calcular a media das alturas:
        double soma = 0.0;
        for (int i=0; i<n;i++){
            soma += vect[i];
        }
        double media = soma/n;

        //Imprimindo com duas casas decimais.
        System.out.printf("A média das alturas digitadas é: %.2f", media);

        sc.close();

    }
}
