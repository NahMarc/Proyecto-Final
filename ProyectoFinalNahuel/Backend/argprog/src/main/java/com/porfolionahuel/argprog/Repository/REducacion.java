/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolionahuel.argprog.Repository;

import com.porfolionahuel.argprog.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreInsti(String nombreInsti);
    public Optional<Educacion> findByNombreCarrera(String nombreCarrera);
    public boolean existsByNombreInsti(String nombreInsti);
    public boolean existsByNombreCarrera(String nombreCarrera);
    
}
