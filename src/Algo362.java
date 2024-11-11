import java.util.Scanner;

public class Algo362 {
    public static void main(String[] args) {
        //cria um algoritmo que leia dois conjuntos de numeros inteiros
        //tendo cada um 10 e 20 elementos e apresente os elementos comuns aos conjuntos
        //podem se repetir mas nao podem aparecer repetidos na saída

        Scanner ler = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[20];
        int[] vetc = new int[10];
        int i, c, d, l;
        l = 0;

        System.out.println("Entrada de dados do vetor 1 (10 Elementos): ");
        for (i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "º elemento: ");
            vet1[i] = ler.nextInt();
        }
        System.out.println("Entrada de dados do vetor2 (20 elementos): ");
        for (i = 0; i < 20; i++) {
            System.out.println("Entre com o " + (i + 1) + "º elemento: ");
            vet2[i] = ler.nextInt();
        }
        for (i = 0; i < 10; i++) {
            vetc[i] = -999999999;
        }
        for (i = 0; i < 10; i++) {
            c = 0;
            while (vet1[i] != vet2[i] && c < 19) {
                c++;
            }
            if (vet1[i] == vet2[c]) {
                d = 0;
                while (vet1[i] != vetc[d] && d < l ){
                    d++;
                }
                if(d == l){
                    vetc[d] = vet1[i];
                    l++;
                }else if( l != 0){
                    System.out.println("***** Elementos Comuns ******");
                    for(i = 0; i <= (l - 1); i++){
                        System.out.println("\n"+ vetc[i]);
                    }
                }else{
                    System.out.println("Não existem elementos cmonuns");
                }
            }
        }

    }
}
