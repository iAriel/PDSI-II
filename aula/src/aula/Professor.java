package aula;

public class Professor extends Pessoa {
	private String titulacaoMaxima;
	
	public Professor(String nome, String endereco, String telefone, String titulacaoMaxima) {
		super(nome, endereco, telefone);
		this.titulacaoMaxima = titulacaoMaxima;
	}

	public String getTitulacaoMaxima() {
		return titulacaoMaxima;
	}

	public void setTitulacaoMaxima(String titulacaoMaxima) {
		this.titulacaoMaxima = titulacaoMaxima;
	}
	
	public void cadastrar() {
		
	}
}
