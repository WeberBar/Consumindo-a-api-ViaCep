package org.example.consultarcep.classes;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.example.consultarcep.exceptions.ExceptionNotFindCep;

public class ConecctionApi {
    private String url, json;
    private Integer statusCodeConection;



    public ConecctionApi(String cep) {
        try {
        HttpClient client = HttpClient.newHttpClient();
        url = "http://viacep.com.br/ws/"+ cep + "/json/";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            statusCodeConection = response.statusCode();
            json = response.body();

        }catch (InterruptedException | IOException e){
            System.out.println(e.getMessage());
        }

    }
    public Integer getStatusCodeConection() {
        return statusCodeConection;
    }
    public String getJson() {
        return json;
    }
}
