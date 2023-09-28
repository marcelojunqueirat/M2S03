package ex4;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public Integer contarPalavras(String frase){
        String[] listaPalavras;
        listaPalavras = frase.split(" ");

        return listaPalavras.length;
    }

    public String getFrase() {
        return frase;
    }
}
