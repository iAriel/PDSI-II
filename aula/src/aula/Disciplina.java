package aula;

public class Disciplina {
	private int codigo, cargaHoraria;
	private String descricao,bibliografia, ementa;
	
	public Disciplina (int codigo, int cargaHoraria, String descricao, String bibliografia, String ementa) {
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
		this.bibliografia = bibliografia;
		this.ementa = ementa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public void cadastrar() {
		
	}
}
