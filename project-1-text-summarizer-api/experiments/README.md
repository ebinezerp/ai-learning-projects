# Summarizer Experiments

Use these files to compare LLM behavior systematically.

The rule for every experiment:

```text
Change one important variable at a time.
```

Examples:

- Change the prompt, but keep input, model, and temperature fixed.
- Change the temperature, but keep input, model, and prompt fixed.
- Change the model, but keep input, prompt, and temperature fixed.

Evaluate summaries by comparing them against the matching expectation files:

- `java-records-summary-expectations.txt`
- `database-indexes-summary-expectations.txt`
- `restaurant-review-summary-expectations.txt`
- `local-ai-models-summary-expectations.txt`

Do not evaluate only by asking whether the summary "sounds good". Check whether it preserves expected facts, avoids invented facts, and follows the requested limit.

