package app;

import entidades.Produto;

import java.util.Scanner;

public class vetorReferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Recebendo o numero de entradas e consequentemente o numero do tamanho do vetor:
        System.out.println("Digite quantos produtos deseja adicionar: ");
        int n = sc.nextInt();

        //Criando um array com base numa classe:
        //Crio e instancio o vetor com o tipo da classe.
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++){
            //abaixo consome a quebra de linha de cima.
            sc.nextLine();

            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            //Preciso apontar para a posição do meu vetor e dentro dessa posição instanciar um produto com nome e preço:
            vetor[i] = new Produto(nome, preco);
        }

        //Calculando a media dos preços:
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i ++){
            //Estou acessando meu atributo produto e pregando o preço dele com get:
            soma += vetor[i].getPreco();
        }
        double media = soma/vetor.length;

        System.out.printf("A média de preço dos produtos é: %.2f%n", media);

        sc.close();
    }
}
