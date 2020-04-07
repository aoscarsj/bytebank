package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("dominando coleções", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 12));
        javaColecoes.adiciona(new Aula("Trabalhando com Vector", 22));
        javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 43));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);

//        System.out.println(aulas);
//        Collections.sort(aulas);
//        System.out.println(aulas);

        System.out.println(javaColecoes);

    }
}
