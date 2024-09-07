package com.fie.apirestivana.Controller;

import com.fie.apirestivana.DTO.PersonaDTO;
import com.fie.apirestivana.Entity.Persona;
import com.fie.apirestivana.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersonas(){
        return personaService.listarPersonas();
    }

    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.crearPersona(persona);
    }

    @DeleteMapping("/persona/{id}")
    @ResponseBody
    public void borrarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaService.buscarPersonaPorId(id);
    }

    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }

    @PostMapping("/login")
    public PersonaDTO login(@RequestBody Persona persona){
        return personaService.login(persona.getUser(), persona.getPassword());
    }
}
