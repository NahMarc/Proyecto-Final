/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Controller;

import com.porfolionahuel.argprog.Dto.dtoPersona;
import com.porfolionahuel.argprog.Entity.Persona;
import com.porfolionahuel.argprog.Security.Service.SPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class CPersona {
    private final SPersona sPersona;

    @Autowired
    public CPersona(SPersona sPersona) {
        this.sPersona = sPersona;
    }

    @GetMapping("/traer")
    public ResponseEntity<List<Persona>> getPersonas() {
        List<Persona> personas = sPersona.findPersonas();
        return new ResponseEntity(personas, HttpStatus.OK);
    }

    @GetMapping("/encontrar/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Long id) {
        Optional<Persona> persona = sPersona.getIdPersona(id);
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> createPersona(@RequestBody Persona perso){
        Persona persona = new Persona(perso.getNombre(), perso.getApellido(), perso.getTitulo(), perso.getSobremi(), perso.getImg(), perso.getImgbanner());
        sPersona.addPersona(persona);
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Persona> editPersona(@RequestBody Persona perso) {
        Persona persona = sPersona.editPersona(perso);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    
    @GetMapping("/traer/perfil")
    public Optional<Persona> findPersona(){
        return sPersona.getIdPersona((long)10);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id){
        sPersona.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    
}
