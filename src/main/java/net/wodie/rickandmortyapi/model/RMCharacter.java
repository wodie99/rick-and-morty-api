package net.wodie.rickandmortyapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RMCharacter {

        private String id;
        private String name;
        private String status;

}
