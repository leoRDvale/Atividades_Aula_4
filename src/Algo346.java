import java.util.Scanner;

public class Algo346 {
    public static void main(String[] args) {
        //Fazer os seguintes Algoritimos:
        // 346, 348, 351, 356, 358 e 360
        //em sala 354; 362; 370; 394; 413

        //Criar um algoritmo que imprime o comprimento da frase,
        //imprime os dois primeiros e dois ultimos caracateres de cada
        //imprime a frase espelhada
        Scanner ler = new Scanner(System.in);
        String frase;
        int opcao, i, tamanho, menosDois;
        do {
            System.out.println("\nMENU:\n1 - Imprime o comprimento da frase\n ");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase:\n");
            System.out.println("3 - Imprime a frase espelhada:\n");
            System.out.println("4 - Termina o algoritmo:");
            System.out.println("*** Digite a opção desejada:***");
            opcao = ler.nextInt();
            if (opcao == 1) {
                System.out.println("Digite uma frase:");
                frase = ler.next();
                System.out.println("O número de caracteres da frase é: " + frase.length()); //comprimento da String
            } else if (opcao == 2) {
                System.out.println("Digite uma frase; ");
                frase = ler.next();
                System.out.println("Os dois primeiros caracteres são: " + frase.substring(0, 2)); //apresenta dos elementos entre indice de inicio e indice final
                menosDois = frase.length() - 2;
                tamanho = frase.length();
                System.out.println("Os dois últimos caracteres são: " + frase.substring(menosDois, tamanho));
            } else if (opcao == 3) {
                System.out.println("Digite um frase: ");
                frase = ler.next();
                String fraseInvertida = new StringBuilder(frase).reverse().toString(); //inverte a posicão dos elementos
                System.out.println("O resultado da frase invertida é: "+ fraseInvertida);
            } else if (opcao == 4) {
                System.out.println("Fim do Algoritmo");
            } else {
                System.out.println("Opção indisponível\n");
            }


        } while (opcao != 4);
        System.out.println("\n");


    }
}
