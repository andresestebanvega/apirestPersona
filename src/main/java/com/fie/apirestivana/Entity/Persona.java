package com.fie.apirestivana.Entity;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter //genera los getter y setter
@Entity //sirve para indicar que la clase es una entidad
public class Persona {
    @Id //indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica que es autoincremental
    Long id;
    @Basic //indica que es un campo basico
    String ubication;
    String position;
    String fullName;
    String image;
    String user;
    String password;

    public Persona() {
    }

    public Persona(String ubication, String position, String fullName, String image) {
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
    }
}
