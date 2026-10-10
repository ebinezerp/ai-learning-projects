package com.apps.textsummarizer;

public record OllamaRequest(String model, String prompt, OllamaOptions options, boolean stream) {
}
