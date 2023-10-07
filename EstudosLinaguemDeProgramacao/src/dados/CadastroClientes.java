package dados;
import java.util.Scanner;

public class CadastroClientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numClientes = new int[5];
        
        for(int i=0; i<numClientes.length; i++ ) {
            Cliente cliente1 = new Cliente(0, null, 0, 0);

            
            
            System.out.println("Insira o codigo: ");
            cliente1.setCodigo(sc.nextInt());
            
            System.out.println("Insira o nome: ");
            cliente1.setNome(sc.next());
            
            System.out.println("Insira o CPF: ");
            cliente1.setCpf(sc.nextInt());
            
            System.out.println("Insira o número de telefone: ");
            cliente1.setTelefone(sc.nextInt());

            int codigo = cliente1.getCodigo();
            String nome = cliente1.getNome();
            int cpf = cliente1.getCpf();
            int telefone = cliente1.getTelefone();

            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Telefone: " + telefone);

        }
        

        // Fechar o scanner
        sc.close();
    }
}
