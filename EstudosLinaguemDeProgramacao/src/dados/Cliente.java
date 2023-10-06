package dados;

public class Cliente {
	public String codigo;
	public String nome;
	public int cpf;
	public int telefone;
	
	public Cliente(String codigo, String nome, int cpf, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
}
