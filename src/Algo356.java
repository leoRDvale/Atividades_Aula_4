import java.util.Scanner;

public class Algo356 {
    public static void main(String[] args) {
        //Criar um algoritmo que armazene nomes e notas das prova1 e prova 2 de 15 alunos.
        //Calcule a média arredondada. Armazene a situação do aluno, aprovado ou reprovado
        // imprima uma lista com nomes, notas, medias, e situação de cada aluno
        //Obs: nomes devem conter até 30 caracteres (não citado no exercício)

        Scanner ler = new Scanner(System.in);
        int i, caracteres, tamanho;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] situacao = new String[15];
        float[] prova1, prova2;
        for (i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + ("º nome: "));
            nomes[i] = ler.nextLine();

        }

    }
}
