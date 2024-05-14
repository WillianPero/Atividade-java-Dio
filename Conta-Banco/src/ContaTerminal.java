import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Por Favor, Digite sua Conta.");
        Double conta = scanner.nextDouble();

        System.out.println("Por Favor, Digite sua Agência.");
        String agencia = scanner.next();

        System.out.println("Por Favor, Digite seu Nome.");
        String nome = scanner.next();

        System.out.println("Por Favor, Digite seu Depósito.");
        String Deposito = scanner.next();

    }

}
