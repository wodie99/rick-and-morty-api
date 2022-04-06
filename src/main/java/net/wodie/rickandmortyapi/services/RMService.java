package net.wodie.rickandmortyapi.services;

import net.wodie.rickandmortyapi.api.RMServiceApi;
import net.wodie.rickandmortyapi.model.RMCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RMService {

    private RMServiceApi rmServiceApi;

    @Autowired
    public RMService(RMServiceApi rmServiceApi) {
        this.rmServiceApi = rmServiceApi;
    }

    public List<RMCharacter> getAllRMCharacters() {
        return rmServiceApi.getAllRMCharacters();

    }
}
