package dados;
import java.util.Scanner;

public class CadastroClientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente[] clientes = new Cliente[5]; // Mudamos de int[] para Cliente[]

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Cliente " + (i + 1));
            System.out.println("Insira o código: ");
            int codigo = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            System.out.println("Insira o nome: ");
            String nome = sc.nextLine();

            System.out.println("Insira o CPF: ");
            String cpf = sc.nextLine();

            System.out.println("Insira o número de telefone: ");
            String telefone = sc.nextLine();

            clientes[i] = new Cliente(codigo, nome, cpf, telefone);
        }

        // Exibindo os dados dos clientes
        for (Cliente cliente : clientes) {
            int codigo = cliente.getCodigo();
            String nome = cliente.getNome();
            String cpf = cliente.getCpf();
            String telefone = cliente.getTelefone();

            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Telefone: " + telefone);
            System.out.println("--------------------------");
        }

        // Fechar o scanner
        sc.close();
    }
}
