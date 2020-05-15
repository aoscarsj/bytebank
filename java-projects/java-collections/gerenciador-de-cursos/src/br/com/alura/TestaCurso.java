package br.com.alura;

import java.util.List;

public class TestaCurso {
    
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("dominando coleções", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 12));
        javaColecoes.adiciona(new Aula("Trabalhando com Vector", 22));
        javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 43));

        System.out.println(javaColecoes.getAulas());


    }
}
