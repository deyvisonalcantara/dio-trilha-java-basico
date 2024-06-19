import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal2 {
    public static void main(String[] args) {

        //Criando objeto scanner
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agência");
        int agencia = scanner.nextInt();

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();

        double saldo = 124.55;

        //Imprmindo os dados obtidos pelo usuário

        System.out.println("Olá, " + nome + " " + sobrenome + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo  disponível para saque é R$" + saldo + ".");

    }
    
}
