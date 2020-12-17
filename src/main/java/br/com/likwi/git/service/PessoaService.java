package br.com.likwi.git.service;

import br.com.likwi.git.dao.Pessoa;

public class PessoaService {
    public Pessoa novaPessoa(String nome) {
        return new Pessoa(1, "exemplo");
    }
}
