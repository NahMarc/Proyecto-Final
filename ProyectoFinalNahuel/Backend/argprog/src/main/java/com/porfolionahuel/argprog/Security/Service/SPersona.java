/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Security.Service;

import com.porfolionahuel.argprog.Entity.Persona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolionahuel.argprog.Repository.RPersona;

@Service
@Transactional
public class SPersona {
     private final RPersona rPersona;

    @Autowired
    public SPersona(RPersona rPersona) {
        this.rPersona = rPersona;
    }

    public Persona addPersona(Persona persona) {
        return rPersona.save(persona);
    }

    public List<Persona> findPersonas(){
        return rPersona.findAll();
    }

    public Optional<Persona> getIdPersona(Long id) {
        return rPersona.findById(id);
    }

    public Persona editPersona(Persona persona){
        return rPersona.save(persona);
    }

    public void deletePersona(Long id){
        rPersona.deleteById(id);
    }
    
}
