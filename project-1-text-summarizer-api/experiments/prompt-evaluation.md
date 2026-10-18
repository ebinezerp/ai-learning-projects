# Prompt Evaluation

Goal: compare different prompt styles while keeping the input, model, temperature, and output limit fixed.

## Fixed Settings

| Setting | Value |
|---|---|
| Date |  |
| Model |  |
| Temperature |  |
| Output limit |  |

## Prompt Versions

### Prompt A - Minimal

```text
Summarize the following text in no more than 100 words.

Text:
<INPUT>
```

### Prompt B - Constraint Based

```text
Summarize the following text in no more than 100 words.

Requirements:
- Capture the main idea.
- Include major points.
- Do not invent information.
- Remove unnecessary detail.

Text:
<INPUT>
```

### Prompt C - Priority Based

```text
Summarize the following text in no more than 100 words.

Prioritize:
1. Main idea
2. Core concepts
3. Important facts

Omit:
- examples unless necessary
- repetition
- minor details

Do not include information that is not present in the source.

Text:
<INPUT>
```

## Evaluation Table

| Input | Prompt | Main idea captured | Key points covered | Important points missed | Incorrect facts | Invented facts | Unnecessary detail | Clarity | Word limit | Overall |
|---|---|---|---|---|---|---|---|---|---|---|
| Java Records | A |  |  |  |  |  |  |  |  |  |
| Java Records | B |  |  |  |  |  |  |  |  |  |
| Java Records | C |  |  |  |  |  |  |  |  |  |
| Database Indexes | A |  |  |  |  |  |  |  |  |  |
| Database Indexes | B |  |  |  |  |  |  |  |  |  |
| Database Indexes | C |  |  |  |  |  |  |  |  |  |
| Indian Restaurant Review | A |  |  |  |  |  |  |  |  |  |
| Indian Restaurant Review | B |  |  |  |  |  |  |  |  |  |
| Indian Restaurant Review | C |  |  |  |  |  |  |  |  |  |
| Local AI Models | A |  |  |  |  |  |  |  |  |  |
| Local AI Models | B |  |  |  |  |  |  |  |  |  |
| Local AI Models | C |  |  |  |  |  |  |  |  |  |

## Notes

| Question | Observation |
|---|---|
| Which prompt covered the most expected points? |  |
| Which prompt missed the fewest important points? |  |
| Which prompt produced the fewest incorrect or invented facts? |  |
| Which prompt was clearest? |  |
| What should the next prompt experiment change? |  |

