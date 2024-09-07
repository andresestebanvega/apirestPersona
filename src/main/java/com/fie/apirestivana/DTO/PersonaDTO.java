package com.fie.apirestivana.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PersonaDTO {

    private Long id;
    private String ubication;
    private String position;
    private String fullName;
    private String image;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, String ubication, String position, String fullName, String image) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
    }
}
