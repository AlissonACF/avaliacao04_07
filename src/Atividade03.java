import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Você é estudante? Digite 'S' para Sim ou 'N' para Não.");
        String estudanteOuNao = scanner.next();

        double tarifa = 4.00;
        double meiaTarifa = 2.00;

        if (idade < 6 || idade > 65) {
            System.out.println("Você não precisa pagar tarifa.");
        } else if (estudanteOuNao.equals("S") && (idade <= 25)) {
            System.out.println("Valor a pagar: " + meiaTarifa);
        }else {
            System.out.println("Valor a pagar: " + tarifa);
        }
    }
}
