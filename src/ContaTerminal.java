import java.util.Scanner;


public class ContaTerminal {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o nome do Cliente: ");
    String NomedoClinte = scanner.nextLine(); 
    
    System.out.println("Valor depósito: ");
    double SaldoCliente = scanner.nextDouble();

    Cliente cliente = new Cliente();

    cliente.cadastrarCliente(NomedoClinte, SaldoCliente);
    cliente.cadostroConcluido();

    scanner.close();
       }


}