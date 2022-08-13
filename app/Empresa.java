package app;

import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios deseja adicionar?");
        int n = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        //Recuperando as entradas do usuário e adicionando nas posições da lista tipo classe Funcionario.
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i + 1) + " funcionário: ");
            System.out.println("Id:");
            int id = sc.nextInt();
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Salario:");
            double salario = sc.nextDouble();

            incluirFuncionario(funcionarios, i, id, nome, salario);

            id += 1;
        }

        //Percorrendo toda a lista:
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }

        //Logica para aumentar salario de um determinado funcionario:
        System.out.println("Digite o id do funcionario: ");
        int idBusca = sc.nextInt();

        String resultado = aumentarSalario(funcionarios, idBusca);

        System.out.println(resultado);

        sc.close();

        //Percorrendo toda a lista:
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }

    }

    //Metodo usado para guardar um novo funcioario num indice especifico da lista:
    public static void incluirFuncionario(List<Funcionario> funcionarios, int cont, int id, String nome, double salario){
        funcionarios.add(new Funcionario(id, nome, salario));
    }

    public static String aumentarSalario(List<Funcionario> funcionarios, int idBusca){
        //Percorrendo toda a lista:
        String resposta = null;
        for(Funcionario funcionario : funcionarios){
            //Comandos abaixo para calcular e incluir o novo salario de um determinado funcionario.
            if (idBusca == funcionario.getId()){

                Scanner sc = new Scanner(System.in);
                System.out.println("Funcionario localizado: " + funcionario.getNome());
                System.out.println("Em quantos porcento deseja aumentar o salario?");
                double porcento = sc.nextDouble();
                double salarioAtual = funcionario.getSalario();
                double salarioNovo = (salarioAtual/100) * porcento + salarioAtual;
                funcionario.setSalario(salarioNovo);

                resposta = "Salário atualizado com sucesso!";

                sc.close();
            }else{
                resposta = "Id não localizado";
            }
        }
        return resposta;
    }

}
