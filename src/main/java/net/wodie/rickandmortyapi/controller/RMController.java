package net.wodie.rickandmortyapi.controller;

import net.wodie.rickandmortyapi.model.RMCharacter;
import net.wodie.rickandmortyapi.services.RMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("character")
public class RMController {

    private final RMService rmService;

    @Autowired
    public RMController(RMService rmService) {
        this.rmService = rmService;
    }

    @RequestMapping
    public List<RMCharacter> getAllCharacters() {
        return rmService.getAllRMCharacters();
    }
}
