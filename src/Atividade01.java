import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuário:");
        String usuario = scanner.next();

        System.out.println("Senha:");
        String senha = scanner.next();

        if ((usuario.equals("admin")) && (senha.equals("1234"))) {
            System.out.println("Login bem-sucedido.");
        }else {
            System.out.println("Login inválido. Conta bloqueada.");
        }
    }
}
