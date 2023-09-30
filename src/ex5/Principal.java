package ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("src","ex5", "megasena.txt");
        if (Files.notExists(arquivo))
            System.out.println("Arquivo nao encontrado!!!");

        List<Concurso> lista = new ArrayList<>();
        List<String> linhas = Files.readAllLines(arquivo);

        for(String linha : linhas) {
            String[] dadoDividido = linha.split(",");

            int numero = Integer.parseInt(dadoDividido[0]);
            LocalDate data = LocalDate.parse(dadoDividido[1], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            int[] sorteados = new int[6];

            for(int i=0; i<=5; i++) {
                String dado = dadoDividido[i+2];
                sorteados[i] = Integer.parseInt(dado);
            }

            Concurso concurso = new Concurso(numero, data, sorteados);
            lista.add(concurso);
        }
        lista.forEach(System.out::println);
    }
}
