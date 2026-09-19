import model.Cliente;
import model.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Joao", "123.456.789-00");
        Conta conta = new Conta(cliente);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- BANCO ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor: ");
                double v = sc.nextDouble();
                conta.depositar(v);
            } else if (opcao == 2) {
                System.out.print("Valor: ");
                double v = sc.nextDouble();
                conta.sacar(v);
            } else if (opcao == 3) {
                conta.mostrarSaldo();
            }
        }
        System.out.println("Saindo...");
        sc.close();
    }
}