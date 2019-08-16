package aula;

public class Turma {
	private int ano, semestre, diaSemana;
	private String horario;
	
	public Turma (int ano, int semestre, int diaSemana, String horario){
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horario = horario;
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void abrirTurma() {
		
	}
	
	public void alocarProfessor() {
		
	}
	
	public void matriculaAluno() {
		
	}
	
	public void emitirDiario() {
		
	}
	
}
