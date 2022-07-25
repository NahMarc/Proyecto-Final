/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Controller;

import com.porfolionahuel.argprog.Dto.dtoEducacion;
import com.porfolionahuel.argprog.Entity.Educacion;
import com.porfolionahuel.argprog.Security.Controller.Mensaje;
import com.porfolionahuel.argprog.Security.Service.SEducacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeduc){
        if(StringUtils.isBlank(dtoeduc.getNombreInsti()))
            return new ResponseEntity(new Mensaje("El nombre de la institución es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoeduc.getNombreCarrera()))
            return new ResponseEntity(new Mensaje("El nombre de la carrera/curso es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreInsti(dtoeduc.getNombreInsti()))
            return new ResponseEntity(new Mensaje("Esa institución no existe"), HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreCarrera(dtoeduc.getNombreCarrera()))
            return new ResponseEntity(new Mensaje("Esa carrera/curso no existe"), HttpStatus.BAD_REQUEST);
           
        Educacion educacion = new Educacion(dtoeduc.getNombreInsti(), dtoeduc.getNombreCarrera(), dtoeduc.getAñoInicio(), dtoeduc.getAñoFin());
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educación agregada"), HttpStatus.OK);
        
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoeduc){
        //Se valida la existencia del ID
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        //Se compara el nombre de las instituciones
        if(sEducacion.existsByNombreInsti(dtoeduc.getNombreInsti()) && sEducacion.getByNombreInsti(dtoeduc.getNombreInsti()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa institución no existe"), HttpStatus.BAD_REQUEST);
        
        //Se compara el nombre de las carreras
        if(sEducacion.existsByNombreCarrera(dtoeduc.getNombreCarrera()) && sEducacion.getByNombreCarrera(dtoeduc.getNombreCarrera()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa carrera no existe"), HttpStatus.BAD_REQUEST);
        
        //Comprueba que el campo nombreInsti no esté vacío
        if(StringUtils.isBlank(dtoeduc.getNombreInsti()))
            return new ResponseEntity(new Mensaje("Es obligatorio el campo nombre de la institución"), HttpStatus.BAD_REQUEST);
        
        //Comprueba que el campo nombreCarrera no esté vacío
        if(StringUtils.isBlank(dtoeduc.getNombreCarrera()))
            return new ResponseEntity(new Mensaje("Es obligatorio el campo nombre de la carrera/curso"), HttpStatus.BAD_REQUEST);
        
        
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreInsti(dtoeduc.getNombreInsti());
        educacion.setNombreCarrera(dtoeduc.getNombreCarrera());
        educacion.setAñoInicio(dtoeduc.getAñoInicio());
        educacion.setAñoFin(dtoeduc.getAñoFin());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("No existe la educación"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //Se verifica la existencia de ID
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sEducacion.delete(id);
        
        return new ResponseEntity(new Mensaje("Educación eliminada"), HttpStatus.OK);
    }
    
}
    
