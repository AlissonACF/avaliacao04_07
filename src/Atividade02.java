import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de empréstimo desejado:");
        double emprestimo = scanner.nextDouble();

        System.out.println("Digite o número de parcelas desejadas, de 1 até 24 parcelas:");
        int parcelas = scanner.nextInt();

        System.out.println("Digite sua renda mensal:");
        double renda = scanner.nextDouble();

        double valorParcela = emprestimo / parcelas;

        if (parcelas < 1 || parcelas > 24) {
            System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
            return;
        }

        if (valorParcela < renda) {
            System.out.println("Empréstimo aprovado. Valor de cada parcela: " + valorParcela);
        }else {
            System.out.println("Empréstimo reprovado. Parcela muito alta.");
        }
    }
}
