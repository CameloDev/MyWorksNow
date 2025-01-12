package org.comMatrizes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        List<String> cursosGery = new ArrayList<>(List.of("Induction"));
        Aluno gery = new Aluno("Gery", 1, cursosGery);
        universidade.addAluno(gery);

        List<String> cursosLuis = new ArrayList<>(List.of("Maths", "Science"));
        Aluno luis = new Aluno("Luis", 2, cursosLuis);
        universidade.addAluno(luis);

        gery.addCurso("DataBase I");

        luis.setNota(3);

        System.out.println("Alunos do curso Science: " + universidade.filtrarPorCurso("Science"));

        System.out.println("\nLista de todos os alunos:");
        universidade.listarAlunos();
    }
}
