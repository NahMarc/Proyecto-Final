/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Security.Service;

import com.porfolionahuel.argprog.Entity.Educacion;
import com.porfolionahuel.argprog.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNombreInsti(String nombreInsti){
        return rEducacion.findByNombreInsti(nombreInsti);
    }
    
    public Optional<Educacion> getByNombreCarrera(String nombreCarrera){
        return rEducacion.findByNombreCarrera(nombreCarrera);
    }
    
    public void save(Educacion educ){
        rEducacion.save(educ);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreInsti(String nombreInsti){
        return rEducacion.existsByNombreInsti(nombreInsti);
    }
    
    public boolean existsByNombreCarrera(String nombreCarrera){
        return rEducacion.existsByNombreCarrera(nombreCarrera);
    }
    
}
