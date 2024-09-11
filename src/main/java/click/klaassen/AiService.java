package click.klaassen;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface AiService {

    @UserMessage("{question}")
    String request(String question);
}