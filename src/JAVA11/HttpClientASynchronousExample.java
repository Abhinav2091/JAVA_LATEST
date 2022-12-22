package JAVA11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * An asynchronous request doesn’t block the client i.e. browser is responsive.
 */
public class HttpClientASynchronousExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://www.ldapsoft.com"))
                .build();
        CompletableFuture<Void> response = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);

        response.get();
    }
}
