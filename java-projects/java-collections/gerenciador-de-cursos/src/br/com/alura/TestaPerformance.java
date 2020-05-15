package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        Collection<Long> numeros = new ArrayList<>();

        long inicio = System.currentTimeMillis();
        long inicioTempoAdd = System.currentTimeMillis();
        for (long i = 1; i < 300000; i++)
            numeros.add(i);
        long fimTempoAdd = System.currentTimeMillis();
        long inicioTempoBusca = System.currentTimeMillis();
        for (Long numero: numeros)
            numeros.contains(numero);
        long fimTempoBusca = System.currentTimeMillis();
        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        long tempoDeAdd = fimTempoAdd - inicioTempoAdd;
        long tempoDeBusca = fimTempoBusca - inicioTempoBusca;

        System.out.println("------------------------------------------------------------");
        System.out.println("Tempo de adicionar: " + tempoDeAdd);
        System.out.println("Tempo de busca: " + tempoDeBusca);
        System.out.println("Tempo gasto total gasto: " + tempoDeExecucao);
        System.out.println("------------------------------------------------------------");

    }
}
