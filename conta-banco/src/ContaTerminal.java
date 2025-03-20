import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Simulando uma  conta bancária através do terminal/console</h1>
 * https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
 * @author liukiti
 * @since March 2025
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        scanner.useDelimiter("\\n");

        System.out.println("Digite o número da conta. Ex.: 1021");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da agência seguido de hífen e código. Ex.: 067-8");
        String agencia = scanner.next();

        /**
         * Either put a Scanner.nextLine call after each Scanner.nextInt or 
         * Scanner.nextFoo to consume the rest of that line including newline
         * from: https://stackoverflow.com/a/13102066
         */
        String dummy = scanner.nextLine();
        
        System.out.println("Digite seu nome completo. Ex.: MARIO ANDRADE");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor de depósito inicial. Ex.: 237.48");
        double saldo = scanner.nextDouble();

        System.out.println("\n\n    Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência será a " + agencia + 
                            ",\n    já o número da conta será " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
