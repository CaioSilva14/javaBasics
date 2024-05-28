package javapackage;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        numeroPar();
        stringIgual();
    }

    private static void numeroPar() {
        Integer numero = 145;
        if (numero % 2 == 0){
            System.out.println("verdadeiro, é par");
        }else{
            System.out.println("falso, é ímpar");
        }
    }
    private static void stringIgual() {
        String frase = "Hoje é segunda-feira,";
        if (frase.contains("segunda-feira")){
            System.out.println("Hoje é segunda.");
        }else{
            System.out.println("Hoje não é segunda.");
        }
    }
}
