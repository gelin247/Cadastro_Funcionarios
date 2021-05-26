package br.edu.univas.vo;

public class Vendedor extends Funcionario {

	private float Comissao;

	public Vendedor(float salarioBase, float Comissao, String nome) {
		super(salarioBase, nome);
		this.Comissao = Comissao;

	}

	@Override
	public float calculaSalario() {
		return this.getSalarioBase() + (getSalarioBase() * Comissao / 100);
	}

	public float getComissao() {
		return Comissao;
	}

	public void setComissao(float comissao) {
		Comissao = comissao;
	}

	@Override
	public String toString() {
		return "Vendedor [Comissao=" + Comissao + ", SalarioBase=" + getSalarioBase() + ", Nome()=" + getNome() + "]";
	}

}
