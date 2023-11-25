
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Informe seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o número da Conta:");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, o número da Angência: ");
        agencia = sc.next();

        System.out.println("Valor do desposito:");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                        "conta %d e seu saldo é %.2f", nomeCliente,agencia,numeroConta, saldo);

                        

        sc.close();


    }
}
