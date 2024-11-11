import java.util.Scanner;

public class Algo360 {
    public static void main(String[] args) {
        //criar um algoritmo que imprima o horóscopo de várias pessoas
        //a partir da data de nascimento (dia/mes).
        // para sair digite 9999 no campo data

        Scanner ler = new Scanner(System.in);
        int [] ultimoDia = new int[12];
        int i, data, dia, mes;
        String [] signo = new String[12];
        mes = 0;
        for(i = 0; i < 12; i++){
            System.out.println("Digite o signo: ");
            signo[i] = ler.nextLine();
            System.out.println("Digite o ultimo dia do mês referente ao signo: ");
            ultimoDia[i] = Integer.parseInt(ler.nextLine());
        }
        System.out.println("Digite a data no formato ddmm  (dia e mês)\nOu digite 9999 para encerrar o programa");
        data = Integer.parseInt(ler.nextLine());
        while (data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes--;
            if(dia > ultimoDia[mes]){
                mes = (mes + 1)% 12;
            }
            System.out.println("Seu signo é: "+ signo[mes]);
        }
    }
}
