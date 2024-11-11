import java.util.Scanner;

public class Algo354 {
    public static void main(String[] args) {
        //criar um algoritmo que armazena 15 número inteiros em um vetor numeros[]
        //e imprima uma listagem numerada contendo o número e se é par ou impar

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[15];
        int i;

        for (i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }
        System.out.println("****** Relação dos números *****");
        for (i = 0; i < 15; i++) {
            System.out.println((i+1)+"º número: "+ numeros[i]);
            if(numeros[i] % 2 == 0){
                System.out.println("é par");
            }else{
                System.out.println("é impar");
            }
        }

    }
}
