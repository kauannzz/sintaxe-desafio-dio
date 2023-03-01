import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Digite o número da conta:");
        Integer conta = scanner.nextInt();

        System.out.println("Agora, digite o número da agência com (-):");
        String agencia = scanner.next();


        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo completo. Não esqueça de colocar os centavos:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " sua conta é " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
