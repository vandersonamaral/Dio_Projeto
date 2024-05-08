import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da Agência ! ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Nome Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Saldo Cliente: ");
        double saldoCliente = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+" , obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldoCliente+" já está disponível para saque.");
        sc.close();
    }
}
