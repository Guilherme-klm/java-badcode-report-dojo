package cc.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class report_de_pessoas {
	/**
	 * imprime a lista de pessoas
	 * @param pessoa
	 */
	public static void impressaoDaPessoas(List<Pessoa> pessoa) {

		for (int i = 0; i < pessoa.size(); i++) {
			Pessoa p = pessoa.get(i);
			Validation validador = new Validation();
			List<String> erros = validador.validaPessoa(p);
			if (erros == null) {
				System.out.println("Nome: " + p.getName());
				System.out.println("Fone: " + p.getTelefonesCelulares());
				System.out.println("CPF: " + p.getCpf());
			} else {
				System.out.println(erros);
			}
		}
	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.name = "Fulano";
		p.cpf = "54229236930";
		p.setIdade(10);

		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("1876534331");
		p.telefonesCelulares = pessoaTelefonesFixos;

		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p);
		impressaoDaPessoas(pessoas);
		
	}

}

 class Pessoa{
	String name;
	String cpf;
	int idade;
	List<String> telefonesFixos;
	List<String> telefonesCelulares;

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getCpf() {
		 return cpf;
	 }

	 public void setCpf(String cpf) {
		 this.cpf = cpf;
	 }

	 public int getIdade() {
		 return idade;
	 }

	 public void setIdade(int idade) {
		 this.idade = idade;
	 }

	 public List<String> getTelefonesFixos() {
		 return telefonesFixos;
	 }

	 public void setTelefonesFixos(List<String> telefonesFixos) {
		 this.telefonesFixos = telefonesFixos;
	 }

	 public List<String> getTelefonesCelulares() {
		 return telefonesCelulares;
	 }

	 public void setTelefonesCelulares(List<String> telefonesCelulares) {
		 this.telefonesCelulares = telefonesCelulares;
	 }
 }