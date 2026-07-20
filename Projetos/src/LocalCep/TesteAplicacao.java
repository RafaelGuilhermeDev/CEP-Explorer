package LocalCep;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAplicacao {
    public static void main(String[] args) throws IOException {
        ConsultaCEP buscarCep = new ConsultaCEP();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem-Vindo ao 'CEP Explorer ?'\n");
            try {
                System.out.println("Digite seu CEP para saber seu endereço:");
                String cep = leitura.nextLine();
                Endereco novoEndereco = buscarCep.buscaEndereco(cep);
                GeradoraDeArquivos gerador = new GeradoraDeArquivos();
                gerador.salvarJson(novoEndereco);
            } catch (IOException | InterruptedException | IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
    }
}
