import java.util.Scanner;

public class Algo370 {
    public static void main(String[] args) {
        //criar um algoritmo que realize as reservas de passagem aéreas de
        //uma companhia. Além da leitura do número de voos e da quantidade
        //de lugares disponiveis, leia vários pedidos de reserva, constituidos
        //do número da carteira de identidade do cliente e do numero do voo.
        //verificar a disponibilidade do voo desejado
        //imprimir o numero da identidade do cliente, numero do voo,
        // atualizanddo o numero de lugares disponiveis.
        //Avisar caso não haja lugares disponiveis

        Scanner ler = new Scanner(System.in);
        int numeroVoo, i;
        i = 0;
        String numeroVooDesejado, id;
        String[] nome = new String[1000];
        Integer[] voos = new Integer[1000];

        System.out.println("Digite o número de voos: ");
        numeroVoo = Integer.parseInt(ler.nextLine());
        for (i = 0; i < numeroVoo; i++) {
            System.out.println("Digite a identificação do " + (i + 1) + "º voo: ");
            nome[i] = ler.nextLine();
            System.out.println("Digite a quantidade de lugares disponíveis no voo: " + nome[i] + ": ");
            voos[i] = Integer.parseInt(ler.nextLine());
        }
        System.out.println("Digite o número do voo desejado.\nOu digite @ para encerrar a reserva.");
        numeroVooDesejado = ler.nextLine();

        //uso do equals para comparação de Strings (cadeia de caracteres)

        while (!numeroVooDesejado.equals("@")) {
            i = 0;
            while (!numeroVooDesejado.equals(nome[i]) && (i < (numeroVoo - 1))) {
                i++;
            }
            if (nome[i].equals(numeroVooDesejado)) {
                if (voos[i] > 0) {
                    voos[i]--;
                    System.out.println("Qual o número da identidade do cliente ?");
                    id = ler.nextLine();
                    System.out.println("Identidade: " + id + "\nVoo: " + numeroVooDesejado + "\n");
                } else {
                    System.out.println("Não existem mais lugares diponíveis nesse voo.");
                }
            } else {
                System.out.println("Não foi encontrado esse voo");
            }
            System.out.println("Digite o número do voo desejado.\nOu digite @ para encerrar a reserva.");
            numeroVooDesejado = ler.nextLine();


        }

    }
}
