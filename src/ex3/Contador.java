package ex3;

public class Contador {
    public static void contarPalavras(String frase){
        String[] listaPalavras;
        listaPalavras = frase.split(" ");

//        for (String palavra : listaPalavras)
//            System.out.println(palavra);

        System.out.println("A quantidade de palavras na frase '"+ frase +"' é: " + listaPalavras.length);
    }
}
