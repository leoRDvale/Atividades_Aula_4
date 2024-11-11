import java.util.Scanner;

public class Algo358 {
    public static void main(String[] args) {
        //crie um algoritmo que leia o preço de compra e o preço de venda
        //de 100 mercadorias. Ele deverá imprimir quantas mercadorias proporcionam:
        //lucro < 10%
        //10% <= lucro <= 20%
        //lucro > 20%

        Scanner ler = new Scanner(System.in);
        float lucro;
        float[] precoCompra = new float[100]; //para testes, melhor usar um valor menor, como 10 por exemplo
        float[] precoVenda = new float[100];
        int i, lucroMenor10, lucroMenor20, lucroMaior20;
        lucroMenor10 = 0;
        lucroMenor20 = 0;
        lucroMaior20 = 0;

        for(i = 0; i < 100; i++){
            System.out.println("Digite o preço de compra: ");
            precoCompra[i] = ler.nextFloat();
            System.out.println("Digite o preço de venda: ");
            precoVenda[i] = ler.nextFloat();
        }
        for(i = 0; i < 100; i++){
            lucro = precoVenda[i] - precoCompra[i];
            if(lucro < 10){
                lucroMenor10++;
            } else if (lucro <=20) {
                lucroMenor20++;
            }else{
                lucroMaior20++;
            }
        }
        System.out.println("Total de mercadorias com lucro abaixo de 10%: "+ lucroMenor10);
        System.out.println("Total de mercadorias com lucro acima de 10% e abaixo de 20%: "+ lucroMenor20);
        System.out.println("Total de mercadorias com lucro acima 20%: "+ lucroMaior20);

    }
}
