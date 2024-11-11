import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Algo348 {
    public static void main(String[] args) {
        //Criar um algoritmo que armazene duas notas de 5 alunos
        //imprimir uma lista contendo nome, as novas e a média de cada aluno

        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        float[] nota1 = new float[5];
        float[] nota2 = new float[5];
        float[] media = new float[5];
        int i;
        // (i < 5) no caso de vetores significa -> i menor que 5 não inclusivo, ou seja 0, 1, 2, 3, 4
        // ele para a contagem no 5 sem o incluir.
        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = ler.nextLine();
            System.out.println("Digite a 1º nota: ");
            nota1[i] = Float.parseFloat(ler.nextLine());
            System.out.println("Digite a 2º nota: ");
            nota2[i] = Float.parseFloat(ler.nextLine());
            media[i] = (nota1[i] + nota2[i]) / 2;

        }
        System.out.println("****** Notas Finais ******");
        for( i = 0; i < 5; i++){
            System.out.println((i + 1)+ " - "+ nomes[i]);
            System.out.println("Primeira nota: "+nota1[i]+"\t"+"Segunda nota: "+nota2[i]+"\t"+"Média final: "+media[i]);
        }

    }
}
