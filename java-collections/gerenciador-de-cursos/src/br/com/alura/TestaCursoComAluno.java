package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando as Coleções", 23));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 54875);
        Aluno a3 = new Aluno("Mauricio Aniche", 17654);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        // se usar list funciona! Nao funciona aqui pq set usa tabela de espelhamento, tem que sobreescrever o hashCode
        System.out.println(javaColecoes.estaMatriculado(turini));


        // Formas de Iterar apos java 7 ou 8
        for (Aluno a: javaColecoes.getAlunos()) {
            System.out.println(a);
        }
        // Forma antiga, por iterator
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        Vector<Aluno> vetor = new Vector<>(); // ela eh threadSafe mas nao eh recomendado usar, tem maneira melhor de trabalhar com collections em multi-thread
    }
}
