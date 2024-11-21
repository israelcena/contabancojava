import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência (com digito)!");
        contaTerminal.setAgencia(scanner.next());
        System.out.println("Agora digite o número da Conta (somente números)");
        contaTerminal.setNumero(scanner.nextInt());
        System.out.println("Agora digite seu nome completo");
        contaTerminal.setNomeCliente(scanner.next());
        scanner.nextLine(); 
        System.out.println("Agora digite o valor da conta");
        contaTerminal.setSaldo(scanner.nextDouble());

        String mensagem = "Olá "
        .concat(contaTerminal.getNomeCliente())
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(contaTerminal.getAgencia())
        .concat(", conta ")
        .concat(String.valueOf(contaTerminal.getNumero()))
        .concat(" e seu saldo ")
        .concat(String.valueOf(contaTerminal.getSaldo()))
        .concat(" já está disponível para saque.");

        System.out.println(mensagem);
        
        scanner.close();
    }
}
