package ex4;

public class TestaContador2 {
    public static void main(String[] args) {
        Contador2 contador2 = new Contador2("Olá, meu nome é Marcelo, estudante do DEVinHouse.");
        System.out.println(
                "Quantidade de palavras da frase: '"
                        + contador2.getFrase() + "' é: "
                        + contador2.contarPalavras(contador2.getFrase())
        );
    }
}
