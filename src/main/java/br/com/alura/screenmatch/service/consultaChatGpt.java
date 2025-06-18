package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class consultaChatGpt {

        public static String obterTraducao(String texto) {
            OpenAiService service = new OpenAiService("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");

            CompletionRequest requisicao = CompletionRequest.builder()
                    .model("gpt-3.5-turbo-instruct")
                    .prompt("traduza para o português o texto: " + texto)
                    .maxTokens(1000)
                    .temperature(0.7)
                    .build();

            var resposta = service.createCompletion(requisicao);
            return resposta.getChoices().getFirst().getText();
        }
    }

