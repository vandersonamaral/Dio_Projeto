import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.println("Informe a quantidade de clientes: ");
        int qtd = sc.nextInt();
        for (int i = 1; i <= qtd; i++) {
            System.out.println("Informe o nome do cliente: ");
            String nome = sc.next();
            cliente.setNome(nome);
            System.out.println("Informe o cpf do cliente valido: ");
            String cpf = sc.next();
            if (cliente.validaCPF(cpf)==true) {
                System.out.print("Tipo de Conta(cc)/(cp): ");
                String tipoConta = sc.next();
                if (tipoConta.equals("CC")) {
                    List<ContaCorrente> contaCorrente = new ArrayList<ContaCorrente>();
                    contaCorrente.add(new ContaCorrente(cliente));
                } else if (tipoConta.equals("CP")) {
                    List<ContaPoupanca> contaPoupancas = new ArrayList<ContaPoupanca>();
                    contaPoupancas.add(new ContaPoupanca(cliente));
                }

                System.out.println("Cliente Cadastrado com sucesso! ");

            }
            else
                throw new RuntimeException("Cpf invalido");

        }
        for (int i = 1; i <=qtd; i++){
            System.out.println("#"+i+" Nome do cliente "+ cliente.getNome());
        }


    }
}

