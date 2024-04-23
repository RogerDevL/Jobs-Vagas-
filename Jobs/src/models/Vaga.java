package models;

public class Vaga {

	private int candidatos;
	private String horario;
	private String modelo;
	private double salario;

	public Vaga(int candidatos, String horario, String modelo, double salario) {
		super();
		this.candidatos = candidatos;
		this.horario = horario;
		this.modelo = modelo;
		this.salario = salario;
	}

	public int getCandidatos() {
		return candidatos;

	}

	public void setCandidatos(int candidatos) {
		this.candidatos = candidatos;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
