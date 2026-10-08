package br.com.src.curso.arquivo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Algoritmo56 {
    public static void main(String[] args) {
        String url = "https://api.github.com/repos/RomuloMendes/java-projetos/commits";
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .header("x-api-key", "SUA_CHAVE_AQUI")
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                System.out.println("Resposta da API:");
                System.out.println(response.body());
            } else {
                System.out.println("Erro na requisição. Código de status: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}