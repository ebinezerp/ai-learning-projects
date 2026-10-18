package com.apps.practiceprojects.textsummarizer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummaryController {

    private final SummaryService summaryService;

    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @PostMapping("/summarize")
    public String summarizeText(@RequestBody SummaryRequest summaryRequest) {
        String text = summaryRequest.text();
        int maxLength = summaryRequest.maxLength();

        // Call the summarization logic here (you can implement your own summarization algorithm)
        String summary = this.summaryService.summarize(text, maxLength);

        return summary;
    }

}
