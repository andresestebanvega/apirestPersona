package com.fie.apirestivana.Service;

import com.fie.apirestivana.DTO.PersonaDTO;
import com.fie.apirestivana.Entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import com.fie.apirestivana.Repository.PersonaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Persona crearPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public void borrarPersona(Long id){
        personaRepository.deleteById(id);
    }

    public List<Persona> listarPersonas(){
        return personaRepository.findAll();
    }

    public Persona buscarPersonaPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }

    public void modificarPersona(Persona persona){
        personaRepository.save(persona);
    }

    public PersonaDTO login(String user, String password){
        Persona persona =  personaRepository.findByUserAndPassword(user, password);
        if (persona != null) {
            return new PersonaDTO(persona.getId(), persona.getUbication(),
                    persona.getPosition(), persona.getFullName(), persona.getImage());
        }
        return null;
    }
}

