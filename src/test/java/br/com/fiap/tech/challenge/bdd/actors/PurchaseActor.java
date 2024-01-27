package br.com.fiap.tech.challenge.bdd.actors;

import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.response.PurchaseResponse;
import br.com.fiap.tech.challenge.bdd.response.ResponseList;
import com.fasterxml.jackson.core.type.TypeReference;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static br.com.fiap.tech.challenge.bdd.util.JsonUtil.fromJsonString;
import static org.assertj.core.api.Assertions.assertThat;

public class PurchaseActor {

    private PurchaseActor() {}

    public static Optional<PurchaseResponse> getPurchaseByPaymentId(String id) {
        return getAllPurchases()
                .content()
                .stream()
                .filter(p -> p.getPayment().getId().equals(id))
                .findFirst();
    }

    private static ResponseList<PurchaseResponse> getAllPurchases() {
        try {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format(SERVICE_HOST + "/purchase")))
                    .headers("Content-Type", "application/json")
                    .headers("Authorization", "Bearer " + Auth.token)
                    .GET()
                    .build();

            var response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            assertThat(response.statusCode()).isEqualTo(200);

            var typeRef = new TypeReference<ResponseList<PurchaseResponse>>() {};
            return fromJsonString(response.body(), typeRef);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
