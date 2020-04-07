package br.com.alura;

public class TesteEnum {
    public static void main(String[] args) {
        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());

        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());
    }
}
