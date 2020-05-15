package br.com.alura;

import javax.swing.*;
import java.security.KeyStore;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        Set<String> chaves = nomesParaIdade.keySet();
        for(String nome : chaves){
            System.out.println("nome = " + nome);
        }
        Collection<Integer> valores = nomesParaIdade.values();
        for(Integer idade : valores){
            System.out.println("idade = " + idade);
        }
        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for(Map.Entry<String,Integer> associacao : associacoes)
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
    }
}
