package com.numpyninja.lmsmessageservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Configuration
public class WebClientConfig {
    @Value("${lms.api.base-url}")
    private String lmsApiBaseUrl;

    @Value("${lms.api.auth-token}")
    private String lmsApiAuthToken;
    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl(lmsApiBaseUrl)
                .filter(addAuthorizationHeader(lmsApiAuthToken))
                .build();
    }
    private ExchangeFilterFunction addAuthorizationHeader(String authToken) {
        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
            // Clone the original headers and add the authorization header
            HttpHeaders headers = new HttpHeaders();
            clientRequest.headers().forEach((name, values) -> headers.addAll(name, values));
            headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + authToken);
            // Create a new ClientRequest with the modified headers
            ClientRequest newRequest = ClientRequest.from(clientRequest)
                    .headers(httpHeaders -> httpHeaders.addAll(headers))
                    .build();
            // Proceed with the modified request
            return Mono.just(newRequest);
        });
    }

}



