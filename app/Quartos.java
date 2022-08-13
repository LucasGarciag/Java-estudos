package app;

import entidades.Inquilino;

import java.util.Scanner;

public class Quartos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criando meu vetor com 10 quartos para alugar:
        Inquilino[] quartos = new Inquilino[10];

        System.out.println("Quantos estudantes alugarão quartos? ");
        int n = sc.nextInt();

        //Guardando as entradas do usuário e chamando a função guardarInquilino para instanciar minha entidade:
        for(int i = 0; i < n; i++){
            System.out.println("Dados do " + (i+1) + "º Inquilino:");
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Email:");
            String email = sc.next();
            System.out.println("Numero do quarto:");
            int quarto = sc.nextInt();

            guardarInquilino(quartos, nome, email, quarto);
        }

        //Imprimindo as posições não nulas do meu vetor:
        for(int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null){
                System.out.println(quartos[i].toString());
            }
        }

        sc.close();
    }

    //Metodo abaixo para instanciar um novo inquilino de acordo com a posição de um quarto vazio:
    public static void guardarInquilino(Inquilino quartos[], String nome, String email, int quarto){
        quartos[quarto] = new Inquilino(nome, email, quarto);
        //System.out.println(quartos[quarto]);
    }
}
