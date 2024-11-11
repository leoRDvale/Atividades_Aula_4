import javax.swing.*;
import java.util.Scanner;

public class Algo351 {
    public static void main(String[] args) {
        //criar um algoritmo que armazena 5 nomes em um vetor, e que depois possa ser digitado um numero
        // e imprimir o nome que corresponde a esse numero.

        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        int i, numero;
        numero = 0;
        for(i = 0; i < 5; i++){
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"º nome: ");
            numero = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da pessoa: ")));

        }while (numero < 1 && numero > 5){
            JOptionPane.showMessageDialog(null, "Número fora do intervalo!");
            numero = (Integer.parseInt(JOptionPane.showInputDialog(null, "Tente Novamente. Digite o número da pessoa: ")));
        }
        numero = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da pessoa: ")));
        JOptionPane.showMessageDialog(null, "Nome: "+ nomes[numero - 1]); // menos 1 por que o valor é armazenado pelo indice, e o mesmo começa em zero, o nome 1 vai ser armazenado no indice 0.

    }



}
