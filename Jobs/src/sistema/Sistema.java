package sistema;

import java.util.ArrayList;
import java.util.Scanner;

import models.Vaga;

public class Sistema {

	static public void menu() {
		System.out.println("###############");
		System.out.println("1 - Cadastrar Vaga");
		System.out.println("2 - Listar Vagas");
		System.out.println("3 - Delete Vaga");
		System.out.println("4 - Atualizar Vaga");
		System.out.println("9 - Sai do Sistema");
		System.out.println("###############");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Vaga> Vagas = new ArrayList<Vaga>();
		boolean sistema = true;
		do {
			menu();
			int escolha = sc.nextInt();
			switch (escolha) {
			case 1: {
				Vaga vaga = new Vaga(0, "", "", 0);
				System.out.println("Qual é o Salario proposto: ");
				vaga.setSalario(sc.nextDouble());
				while (vaga.getSalario() <= 0) {
					System.out.println("seu salario está errado, digite novamente...");
					System.out.println("digite o salario: ");
					vaga.setSalario(sc.nextDouble());
				}
				System.out.println("Modelo da Vaga: ");
				vaga.setModelo(sc.next());
				System.out.println("Horario da Vaga: ");
				vaga.setHorario(sc.next());
				System.out.println("Numero limite de candidatos: ");
				vaga.setCandidatos(sc.nextInt());
				System.out.println("Cadastro feito com sucesso!!!");
				while (vaga.getCandidatos() <= 0) {
					System.out.println("o numeor de candidatos está errado, digite novamente...");
					System.out.println("digite o numero de candidatos: ");
					vaga.setCandidatos(sc.nextInt());
				}
				Vagas.add(vaga);
				continue;
			}
			case 2: {
				Vagas.forEach(vaga -> {
					System.out.println("esse é o salario: " + vaga.getSalario());
					System.out.println("esse é o modelo: " + vaga.getModelo());
					System.out.println("esse é o horario: " + vaga.getHorario());
					System.out.println("esse é o maxímo de candidato: " + vaga.getCandidatos());
				});
				continue;
			}
			case 3: {
				Vagas.forEach(vaga -> {
					System.out.println(Vagas.indexOf(vaga));
					System.out.println(vaga.getSalario());
					System.out.println(vaga.getModelo());
					System.out.println(vaga.getHorario());
					System.out.println(vaga.getCandidatos());
				});
				Vaga vaga = new Vaga(0, "", "", 0);
				System.out.println("Qual vaga voce deseja deletar?");
				int opcaoDigitadaDel = sc.nextInt();
				while (opcaoDigitadaDel > Vagas.size() || opcaoDigitadaDel < 0) {
					System.out.println("Vagas nn existem...");
					opcaoDigitadaDel = sc.nextInt();
				}
				continue;
			}
			case 4: {
				Vagas.forEach(vaga -> {
					System.out.println(Vagas.indexOf(vaga));
					System.out.println(vaga.getSalario());
					System.out.println(vaga.getModelo());
					System.out.println(vaga.getHorario());
					System.out.println(vaga.getCandidatos());
				});
				Vaga vaga = new Vaga(0, "", "", 0);
				System.out.println("Qual vaga voce deseja atualizar?");
				int opcaoDigitadaAtt = sc.nextInt();
				while (opcaoDigitadaAtt > Vagas.size() || opcaoDigitadaAtt < 0) {
					System.out.println("Vagas nn existem...");
					System.out.println("digite novamente: ");
					opcaoDigitadaAtt = sc.nextInt();
				}
				System.out.println("digite o salario: ");
				vaga.setSalario(sc.nextDouble());
				while (vaga.getSalario() <= 0) {
					System.out.println("seu salario está errado, digite novamente...");
					System.out.println("digite o salario: ");
					vaga.setSalario(sc.nextDouble());
				}
				System.out.println("digite o modelo: ");
				vaga.setModelo(sc.next());
				System.out.println("digite o horario: ");
				vaga.setHorario(sc.next());
				System.out.println("digite o numero de candidatos: ");
				vaga.setCandidatos(sc.nextInt());
				while (vaga.getCandidatos() <= 0) {
					System.out.println("o numeor de candidatos está errado, digite novamente...");
					System.out.println("digite o numero de candidatos: ");
					vaga.setCandidatos(sc.nextInt());
				}
				continue;
			}
			case 9: {
				System.out.println("Encerrado...");
				sistema = false;
				break;
			}
			default:
			}
		} while (sistema != false);

	}

}
