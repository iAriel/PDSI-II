package aula;

public class Aluno extends Pessoa{
	private String matricula, situacao;
	
	public Aluno(String nome, String endereco, String telefone, String matricula, String situacao) {
		super(nome, endereco, telefone);
		this.matricula = matricula;
		this.situacao = situacao;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	public void matricularCurso() {
		
	};
	
	public void trancar() {
		
	}
	
	public void formar() {
		
	}
	
	public void evadir() {
		
	}
	
	public void obterAvaliacoes() {
		
	}
	
	public void emitirHistorico() {
		
	}
	
}
