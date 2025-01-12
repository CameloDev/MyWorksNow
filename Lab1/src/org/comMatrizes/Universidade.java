package org.comMatrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Universidade {
    private List<Aluno> alunos;

    public Universidade() {
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<String> filtrarPorCurso(String curso) {
        return alunos.stream()
                .filter(aluno -> aluno.getCursos().contains(curso))
                .map(Aluno::getNome)
                .collect(Collectors.toList());
    }

    public void listarAlunos() {
        alunos.forEach(aluno -> System.out.println(aluno));
    }
}