package com.apps.practiceprojects.llm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class LLMClient {

    private RestClient restClient;

    @Value("${ollama.cofig.model}")
    private String model;

    public LLMClient() {
        this.restClient = RestClient.builder()
                .baseUrl("http://localhost:11434/api").build();
    }

    public String generateSummary(String prompt) {
        OllamaOptions options = new OllamaOptions(0.5f);
        OllamaRequest request = new OllamaRequest(model, prompt, options,false);
        OllamaResponse response = restClient.post()
                .uri("/generate")
                .body(request)
                .retrieve()
                .body(OllamaResponse.class);

        return response.response();
    }

}
