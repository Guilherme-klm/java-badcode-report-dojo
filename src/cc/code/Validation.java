package cc.code;

import java.util.ArrayList;
import java.util.List;

import static cc.code.CPF.CPF;

public class Validation {

    public List<String> validaPessoa (Pessoa pessoa) {
		List<String> constraints = new ArrayList<String>();
		if (pessoa == null) {
			constraints.add("Algum campo está nulo, tente novamente!");
		}

		if (!validarCPF(pessoa.getCpf())) {
		    constraints.add("CPF inválido");
        }

		for (String telefone : pessoa.telefonesFixos) {
			if (telefone.isEmpty() || telefone.length() < 10) {
				constraints.add("Erro - Telefone inválido");
			}
		}
		return constraints;
	}


    public boolean validarCPF (String cpf) {
        if (!CPF(cpf)) {
            return false;
        }
        return true;
    }
}

