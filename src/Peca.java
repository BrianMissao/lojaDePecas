import java.util.Scanner;

public class Peca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código da peça 1:");
        int codigoDaPeca1 = teclado.nextInt();
        System.out.println("Digite a quantidade da peça 1:");
        int quantidadeDePecas1 = teclado.nextInt();
        System.out.println("Digite o valor unitário da peça 1:");
        double valorUnitarioDaPeca1 = teclado.nextDouble();
        System.out.println("Digite o código da peça 2:");
        int codigoDaPeca2 = teclado.nextInt();
        System.out.println("Digite a quantidade da peça 2:");
        int quantidadeDePecas2 = teclado.nextInt();
        System.out.println("Digite o valor unitário da peça 2:");
        double valorUnitarioDaPeca2 = teclado.nextDouble();
        double valorAPagar = (double) ((quantidadeDePecas1 * valorUnitarioDaPeca1) + (quantidadeDePecas2 * valorUnitarioDaPeca2));
        System.out.printf("Valor total a pagar: %.2f", valorAPagar);
    }
}
