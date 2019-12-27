package cc.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class report_de_pessoas {
	/**
	 * a string para somar todos os nomes na lista 
	 */
	static String _s;
	
	/**
	 * imprime a lista de pessoas
	 * @param pessoa
	 */
	public static String impressaoDaPessoa(Pessoa pessoa) {

		Validation validador = new Validation();
		if (validador.validaPessoa(pessoa) != null) {
			return "Nome: " + pessoa.getName() + "Fone: " + pessoa.getTelefonesCelulares() + " CPF: " + pessoa.getCpf();
		} else {
			throw new RuntimeException("Alguma dado foi inserido como nulo, tente novamente!");
		}

	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.name = "Fulano";
		p.cpf = "0033435457";
		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("8765343");
		p.telefonesCelulares = pessoaTelefonesFixos;

		impressaoDaPessoa(p);
		
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