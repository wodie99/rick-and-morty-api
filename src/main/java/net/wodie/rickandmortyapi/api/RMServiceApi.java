package net.wodie.rickandmortyapi.api;

import net.wodie.rickandmortyapi.model.RMCharacter;
import net.wodie.rickandmortyapi.model.RMCharacterInfo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.List;

@Service
public class RMServiceApi {

    WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public List<RMCharacter> getAllRMCharacters() {

        RMCharacterInfo rmCharacterInfo = webClient
                .get()
                .uri("/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(RMCharacterInfo.class)
                .block()
                .getBody();

        return rmCharacterInfo.getResults();


    }



}
