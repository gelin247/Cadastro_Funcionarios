package br.edu.univas.vo;

public abstract class Funcionario {

	private float salarioBase;
	private float horasTrabalhadas;
	private String nome;

	public Funcionario(float salarioBase, String nome) {
		this.salarioBase = salarioBase;
		this.nome = nome;

	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract float calculaSalario();

}
