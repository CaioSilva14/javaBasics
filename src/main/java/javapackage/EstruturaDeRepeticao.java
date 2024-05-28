package javapackage;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        ArrayList<String> palavraList = new ArrayList<>();
        palavraList.add("Caio");
        palavraList.add("Sousa");
        palavraList.add("João");
        palavraList.add("Pedro");
        // foreach
        for (String palavra : palavraList){
            System.out.println(palavra);
        }
    }
}
