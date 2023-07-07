import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o numero da sua conta bancaria: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Preciso que digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Informe o numero da sua agencia. Por favor! ");
        String agencia = teclado.nextLine();

        System.out.println("Poderia dizer qual o saldo atual da sua conta? ");
        double saldo = teclado.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agencia é: "+agencia+", conta: "+numero+", e seu saldo atual: "+saldo+"Já está disponível para estoque");

        
    }
}
