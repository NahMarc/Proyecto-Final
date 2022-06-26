/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolionahuel.argprog.Interface;

import com.porfolionahuel.argprog.Entity.Persona;
import java.util.List;

/**
 *
 * @author monch
 */
public interface IPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();
    
    // Guardar un objeto tipo Persona
    public void savePersona(Persona persona);
    
    // Eliminar un objeto ingresando su id
    public void deletePersona(Long id);
    
    // Buscar una persona por id
    public Persona findPersona(Long id);
}
