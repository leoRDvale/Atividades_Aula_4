import java.util.Scanner;

public class Algo394 {
    public static void main(String[] args) {
        //Crie um algoritmo que armazene nome, duas notas e a média de 50 alunos
        // Para calcular a média: peso 3 para primeira nota; peso 7 para segunda
        //imprima o nome, as duas notas e a média
        //Nomes inseridos devem ter até 30 caracteres (não consta no enunciado)

        Scanner ler = new Scanner(System.in);
        int l, c, tam, flag, flag1, flag2, opcao;
        String[] nomes = new String[50];
        float[] nota1 = new float[50];
        float[] nota2 = new float[50];
        float[] media = new float[50];
        flag = 0;
        flag1 = 0;
        flag2 = 0;
        do {
            System.out.println(" *** MENU - ESCOLHA UMA OPÇÃO*** ");
            System.out.println("1 - INSERIR NOMES ");
            System.out.println("2 - INSERIR 1º NOTA ");
            System.out.println("3 - INSERIR 2º NOTA ");
            System.out.println("4 - CALCULAR MÉDIA ");
            System.out.println("5 - EXIBIR LISTA NA TELA ");
            System.out.println("6 - SAIR");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1) {
                flag = 1;
                for (l = 0; l <= 49; l++) {
                    System.out.println("Digite o " + (l + 1) + "º nome: \n(Com até 30 caracteres)");
                    nomes[l] = ler.nextLine();

                    /*while (nomes[l].length() > 30) {
                        System.out.println("Digite um nome com no máximo 30 caracteres.\nDigite o \"+(l+1)+\"º nome:\n");
                        nomes[l] = ler.nextLine();
                        tam = nomes[l].length();
                        if(tam < 30){
                            for(c = 0; c <= (30 - tam) ;c++ ){
                                nomes[l] = ???*/

                }
            } else if (opcao == 2) {
                if(flag == 0){
                    System.out.println("NÃO POSSUI NOME CADASTRADO");
                }else{
                    for(l = 0; l <= 49; l++){
                        System.out.println("DIGITE A PRIMEIRA NOTA: ");
                        nota1[l] = Integer.parseInt(ler.nextLine());
                    }flag1 = 1;
                }

            }else if(opcao == 3){
                if(flag == 0){
                    System.out.println("NÃO POSSUI NOME CADASTRADO");
                }else{
                    for(l = 0; l <= 49; l++){
                        System.out.println("DIGITE A SEGUNDA NOTA: ");
                        nota2[l] = Integer.parseInt(ler.nextLine());
                    }flag2 = 1;
                }
            }else if(opcao == 4) {
                if (flag == 0 && flag1 == 0 && flag2 == 0) {
                    System.out.println("FALTAM DADOS A SEREM CADASTRADOS");
                } else {
                    for (l = 0; l <= 49; l++) {
                        media[l] = (3 * nota1[l] + 7 * nota2[l]) / 10;
                    }
                }
            } else if (opcao == 5) {
                if(flag == 0 && flag1 == 0 && flag2 == 0){
                    System.out.println("FALTAM DADOS A SEREM CADASTRADOS");
                }else{
                    System.out.println("\nNOME\t\t\t\tPRIMEIRA NOTA\tSEGUNDA NOTA\tMÉDIA\n");
                    for(l = 0; l <= 49; l++){
                        System.out.println("\n"+nomes[l]+"\t"+nota1[l]+"\t"+nota2[l]+"\t"+media[l]);
                    }
                }

            }else if(opcao == 6){
                System.out.println("ENCERRANDO O PROGRAMA");
            }else{
                System.out.println("OPÇÃO INDISPONIVEL");
            }

        } while (opcao != 6);
        System.out.println("\n");

    }
}
