import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu numero");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia + " Conta "  + numero + " e seu Saldo " + saldo + " já está disponível para saque.");


    }   
}
