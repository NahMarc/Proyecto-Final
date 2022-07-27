/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Controller;

import com.porfolionahuel.argprog.Dto.dtoProyectos;
import com.porfolionahuel.argprog.Entity.Proyectos;
import com.porfolionahuel.argprog.Security.Controller.Mensaje;
import com.porfolionahuel.argprog.Security.Service.SProyectos;
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
@RequestMapping("proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyectos {
    @Autowired
    SProyectos sProyectos;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list(){
        List<Proyectos> list = sProyectos.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtoproy){
        if(StringUtils.isBlank(dtoproy.getNombreProy()))
            return new ResponseEntity(new Mensaje("El nombre del proyecto es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoproy.getDescriProy()))
            return new ResponseEntity(new Mensaje("La descripción del proyecto es obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoproy.getImgProy()))
            return new ResponseEntity(new Mensaje("La imagen del proyecto es obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoproy.getLinkProy()))
            return new ResponseEntity(new Mensaje("El link del proyecto es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sProyectos.existsByNombreProy(dtoproy.getNombreProy()))
            return new ResponseEntity(new Mensaje("Ese proyecto no existe"), HttpStatus.BAD_REQUEST);
           
        Proyectos proyecto = new Proyectos(dtoproy.getNombreProy(), dtoproy.getDescriProy(), dtoproy.getImgProy(), dtoproy.getLinkProy());
        sProyectos.save(proyecto);
        
        return new ResponseEntity(new Mensaje("Educación agregada"), HttpStatus.OK);
        
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyectos dtoproy){
        //Se valida la existencia del ID
        if(!sProyectos.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        //Se compara el nombre de los proyectos
        if(sProyectos.existsByNombreProy(dtoproy.getNombreProy()) && sProyectos.getByNombreProy(dtoproy.getNombreProy()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese proyecto no existe"), HttpStatus.BAD_REQUEST);
        
        //Comprueba que el campo nombreProy no esté vacío
        if(StringUtils.isBlank(dtoproy.getNombreProy()))
            return new ResponseEntity(new Mensaje("Es obligatorio el campo nombre del proyecto"), HttpStatus.BAD_REQUEST);
        
        //Comprueba que el campo descriProy no esté vacío
        if(StringUtils.isBlank(dtoproy.getDescriProy()))
            return new ResponseEntity(new Mensaje("Es obligatorio el campo descripción del proyecto"), HttpStatus.BAD_REQUEST);
        
        //Comprueba que el campo imgProy no esté vacío
        if(StringUtils.isBlank(dtoproy.getImgProy()))
            return new ResponseEntity(new Mensaje("Es obligatorio el campo imagen del proyecto"), HttpStatus.BAD_REQUEST);
        
        //Comprueba que el campo linkProy no esté vacío
        if(StringUtils.isBlank(dtoproy.getLinkProy()))
            return new ResponseEntity(new Mensaje("Es obligatorio el campo link del proyecto"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyecto = sProyectos.getOne(id).get();
        proyecto.setNombreProy(dtoproy.getNombreProy());
        proyecto.setDescriProy(dtoproy.getDescriProy());
        proyecto.setImgProy(dtoproy.getImgProy());
        proyecto.setLinkProy(dtoproy.getLinkProy());
        
        sProyectos.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id){
        if(!sProyectos.existsById(id))
            return new ResponseEntity(new Mensaje("No existe el proyecto"), HttpStatus.NOT_FOUND);
        Proyectos proyecto = sProyectos.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //Se verifica la existencia de ID
        if(!sProyectos.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sProyectos.delete(id);
        
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }
    
}
