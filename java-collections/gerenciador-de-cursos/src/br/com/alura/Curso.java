package br.com.alura;

import java.util.*;

public class Curso {
    private String nome, instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>(); // existe LinkedHashSet - Mantem a ordem, TreeSet - Usa arvore rubro-negra, necessita de Ordem Natural ou enviar o comparable pelo construtor
    //hashset eh mais rapido que treeset
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }


    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal() + ", aulas: [" + aulas + "] ]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero){
        return this.matriculaParaAluno.get(numero);
    }
}
