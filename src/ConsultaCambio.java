import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaCambio {

    public Map<String, Double> buscarCambio(String valor){
        URI cambio = URI.create("https://v6.exchangerate-api.com/v6/06fe00258ec5cf1583964687/latest/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(cambio)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui obitar o valor");
        }

        RespostaCambio resposta = new Gson().fromJson(response.body(), RespostaCambio.class);
        return resposta.conversion_rates();
    }
}
