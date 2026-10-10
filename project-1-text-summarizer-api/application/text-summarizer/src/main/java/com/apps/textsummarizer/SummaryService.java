package com.apps.textsummarizer;

import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    private final LLMClient llmClient;
    public SummaryService(LLMClient llmClient) {
        this.llmClient = llmClient;
    }

    public String summarize(String text, int maxLength) {
        String prompt = """
                Summarize the text in a concise manner, keeping the summary under %d characters.
                
                Text: %s
                
                Instructions: 
                
                1. Ensure the summary is clear and coherent.
                2. Avoid adding any new information or opinions.
                3. Focus on the main points and key details.
                4. Response should contain only summary, no additional text or explanations.
                
                 """.formatted(maxLength, text);

        String summary = llmClient.generateSummary(prompt);
        return summary;
    }

}
