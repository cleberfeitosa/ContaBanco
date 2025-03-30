import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner
        //  Exibir as mensagenas para o nosso usuário
        // Obter pela scanner os valores digitados pelo usuário
        // Exibir a mensage da conta criada
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;
        System.out.println("Entre com o nome do Cliente: ");
        nomeCliente = scan.nextLine();
        System.out.println("Entre com o número da agência:");
        agencia = scan.nextLine();
        System.out.println("Entre com o número da conta:");
        numeroConta = scan.nextInt();
        System.out.println("Entre com o saldo da conta:");
        saldo = scan.nextDouble();

        System.out.println("Olá, "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+ " e seu saldo "+saldo+" já está disponível");

        scan.close();
    }


}
