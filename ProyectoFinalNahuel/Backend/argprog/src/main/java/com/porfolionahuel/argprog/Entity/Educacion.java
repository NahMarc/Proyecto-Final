/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreInsti;
    private String nombreCarrera;
    private String anoInicio;
    private String anoFin;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String nombreInsti, String nombreCarrera, String anoInicio, String anoFin) {
        this.id = id;
        this.nombreInsti = nombreInsti;
        this.nombreCarrera = nombreCarrera;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }

    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreInsti() {
        return nombreInsti;
    }

    public void setNombreInsti(String nombreInsti) {
        this.nombreInsti = nombreInsti;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(String anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(String anoFin) {
        this.anoFin = anoFin;
    }

    
    
     
}
