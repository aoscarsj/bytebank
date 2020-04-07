package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Português", 25);
        Aula a2 = new Aula("Matemática", 39);
        Aula a3 = new Aula("História", 19);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

//        Collections.sort(aulas);
//        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo)); // a partir do java 8
        System.out.println(aulas);
    }
}
