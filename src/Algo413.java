import java.util.Scanner;

public class Algo413 {
    public static void main(String[] args) {
        //crie um algoritmo que armazene dados inteiros em uma matriz ordem 5
        //imprima toda a matriz e a raiz quadrada da soma dos quadrados
        // dos números impares localizados abaixo da DS.

        int[][] matriz = new int[5][5];
        int l, c, soma;
        soma = 0;
        Scanner ler = new Scanner(System.in);

        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.println("Digite o elemento " + (l + 1) + " - " + (c + 1) + ":");
                matriz[l][c] = Integer.parseInt(ler.nextLine());
            }
        }
        System.out.println("Toda a Matriz\n");
        for(l = 0; l < 5; l++){
            for(c = 0; c < 5; c++){
                System.out.println(matriz[l][c]);
            }
            System.out.println("\n");
        }
        for(l = 1; l < 5; l++){
            for(c = 5 - l; c < 5; c++){
                if(matriz[l][c] % 2 == 1){
                    soma = soma + (matriz[l][c] * matriz[l][c]);
                }
            }
        }
        System.out.println("A raiz quadrada da soma dos quadrados dos números impares: \n"+(Math.sqrt(soma)));


    }
}
