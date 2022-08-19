import javax.swing.*;

public class GUI {
    public static void main(String[] args){


        //Exibe uma caixa de diálogo:
        JOptionPane.showMessageDialog(null, "Janela criada");

        //Exibe uma janela para digitar:
        String texto = JOptionPane.showInputDialog("Digite: ");

        System.out.println("Você digitou: " + texto);

        //Mostra uma caixa de confirmação:
        int R = JOptionPane.showConfirmDialog(null, "Confirma o nome digitado? \n" + texto);
        System.out.println("Confirmação: " + R);
        ////Retornos da caixa de confirmação:
        //Cancelar: null
        //Sim: 0
        //Não: 1

    }
}
