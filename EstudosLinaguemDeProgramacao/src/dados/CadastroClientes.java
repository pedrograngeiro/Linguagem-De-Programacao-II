package dados;
import java.util.Scanner;

public class CadastroClientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numClientes = 5;
        
        for(int i=0; i<numClientes; i++ ) {
            Cliente cliente1 = new Cliente(0, null, 0, 0);

            cliente1.setCodigo(1);
            cliente1.setNome("João da Silva");
            cliente1.setCpf(123456789);
            cliente1.setTelefone(987654321);

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
