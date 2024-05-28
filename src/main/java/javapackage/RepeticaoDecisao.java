package javapackage;

import java.util.ArrayList;

public class RepeticaoDecisao {
    public static void main (String[] args){

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        for (int posicao = 1; posicao <= 10; posicao++){
            listaDeNumeros.add(posicao);
        }
        System.out.println("Lista de números iniciais: " + listaDeNumeros);

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        for (Integer numero : listaDeNumeros){
            if(numero % 2 == 0){
                numerosPares.add(numero);
            }else {
                numerosImpares.add(numero);
            }
        }
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}
