package app;

import entidades.Pessoa;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que deseja adicionar: ");
        int n = sc.nextInt();

        //Declarando meu vetor tipo Pessoa:
        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < pessoa.length; i++){
            sc.nextLine();

            int contagem = i+1;
            System.out.println("Digite o nome da " + contagem + "º pessoa: ");
            String nome = sc.nextLine();

            System.out.println("Digite a idade da " + contagem + "º pessoa: ");
            int idade = sc.nextInt();

            pessoa[i] = new Pessoa(nome, idade);
        }

        int maiorIdade = 0;
        String nomeMaiorIdade = null;
        for (int i = 0; i < pessoa.length; i++){
            int pegaIdade = pessoa[i].getIdade();

            if (pegaIdade > maiorIdade) {
                maiorIdade = pegaIdade;
                nomeMaiorIdade = String.valueOf(pessoa[i].getNome());
            }
        }

        System.out.println("A pesso mais velha é: " + nomeMaiorIdade + ", com: " + maiorIdade + " anos de idade.");

        sc.close();
    }
}
