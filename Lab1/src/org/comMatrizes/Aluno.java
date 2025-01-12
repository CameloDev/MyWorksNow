package org.comMatrizes;

import java.util.List;

public class Aluno {
    private String nome;
    private int nota;
    private List<String> cursos;

    public Aluno(String nome, int nota, List<String> cursos) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void addCurso(String curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Cursos: " + String.join(", ", cursos);
    }
}