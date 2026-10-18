package com.apps.practiceprojects.llm;

public record OllamaRequest(String model, String prompt, OllamaOptions options, boolean stream) {
}
