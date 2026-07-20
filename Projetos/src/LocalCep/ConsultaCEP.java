package LocalCep;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {
    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpResponse<String> response = null;
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 400) {
                if (cep.length() != 8 | verificarAlfanumerico(cep) | cep.contains(" "))
                    throw new FormatoInvalidoDoCepException("Formato Inválido do CEP");
            }
        } catch (IOException | InterruptedException | JsonSyntaxException e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }
        return new Gson().fromJson(response.body(), Endereco.class);

    }
    public boolean verificarAlfanumerico(String cep) {
        return cep.matches("^[a-zA-Z0-9]+$");
    }
}
