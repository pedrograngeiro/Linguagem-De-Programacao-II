package dados;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	
	public Cliente(int codigo, String nome, String cpf, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	

	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String setTelefone(String telefone) {
		return telefone;
	}
	
	public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }
	
	public boolean verificarNome(String nome) {
		return this.nome.equalsIgnoreCase(nome);
	}
}
