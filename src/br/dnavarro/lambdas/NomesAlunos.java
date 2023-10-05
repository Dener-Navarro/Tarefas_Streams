package br.dnavarro.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NomesAlunos {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("Jose", "M"));
        pessoas.add(new Pessoa("Rose", "F"));
        pessoas.add(new Pessoa("Pedro", "M"));
        pessoas.add(new Pessoa("Lucia", "F"));
        pessoas.add(new Pessoa("Roberto", "M"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("F"))
                .collect(Collectors.toList());

        mulheres.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}
