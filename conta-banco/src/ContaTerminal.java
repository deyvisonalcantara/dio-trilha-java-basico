import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //informções do usuário

        int conta = 1021;
        int agencia = 67201;
        double saldo = 237.48; 
        
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

       System.out.println("Digite Seu nome");
       String nome = scanner.next();
       
       System.out.println("Digite Seu sobrenome");
       String sobrenome  = scanner.next();

       //Imprmindo os dados obtidos pelo usuário

       System.out.println("Olá, " + nome + " " + sobrenome + "." + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo disponível para saque é " + saldo + " reais.");
       
    }
}
