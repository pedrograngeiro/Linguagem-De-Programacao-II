package dados;

public class Cliente {
	public int codigo;
	public String nome;
	public int cpf;
	public int telefone;
	
	public Cliente(int codigo, String nome, int cpf, int telefone) {
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
	
	public int getCpf() {
		return cpf;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public int setCodigo(int codigo) {
		return this.codigo = codigo;
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	public int setCpf(int cpf) {
		return this.cpf = cpf;
	}
	
	public int setTelefone(int telefone) {
		return this.telefone = telefone;
	}
	
}
