package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.CLT;
import br.edu.univas.vo.Estagiario;
import br.edu.univas.vo.Funcionario;
import br.edu.univas.vo.Vendedor;

public class StartApp {

	public static void main(String[] args) {
		StartApp app = new StartApp();
		app.initialize();
	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		ArrayList<Funcionario> funcionario = new ArrayList<>();

		do {
			printMenu();
			opcao = readInteger(scanner);
			if (opcao == 1) {
				cadastrar(scanner, funcionario);
			} else if (opcao == 2) {
				listar(funcionario);
			} else if (opcao == 9) {
				System.out.println("Opcao invalida ");
			} else {
				System.out.println("tchau");
			}

		} while (opcao != 9);
	}

	public void printMenu() {
		System.out.println("Cadastro de funcionarios: ");
		System.out.println("Digite 1 para cadastrar um novo funcionario ");
		System.out.println("Digite 2 para listar todos os funcionarios cadastratos");
		System.out.println("Ou 9 para sair ");

	}

	public void printSubMenu() {

		System.out.println("1- CLT");
		System.out.println("2- ESTAGIARIO");
		System.out.println("3- VENDEDOR");
		System.out.println("9-SAIR");
	}

	private int readInteger(Scanner scanner) {
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}

	private float readFloat(Scanner scanner) {
		float option = scanner.nextFloat();
		scanner.nextLine();
		return option;
	}

	private void cadastrar(Scanner scanner, ArrayList<Funcionario> funcionarios) {
		printSubMenu();
		int option = readInteger(scanner);
		Funcionario funcionario = null;

		System.out.println("Digite o nome do funcionário:");
		String nome = scanner.nextLine();

		System.out.println("Digite o salario base:");
		float salarioBase = readFloat(scanner);

		if (option == 1) {
			funcionario = new CLT(salarioBase, nome);
			funcionarios.add(funcionario);

		} else if (option == 2) {
			System.out.println("Digite o valor pago por hora:");
			float valorHora = readFloat(scanner);
			funcionario = new Estagiario(salarioBase, valorHora, nome);
			funcionarios.add(funcionario);

		} else if (option == 3) {
			System.out.println("Digite o valor da comissão:");
			float comissao = readFloat(scanner);
			funcionario = new Vendedor(salarioBase, comissao, nome);
			funcionarios.add(funcionario);
		}
	}

	public void listar(ArrayList<Funcionario> funcionarios) {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado. ");

		}
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

	}
}
