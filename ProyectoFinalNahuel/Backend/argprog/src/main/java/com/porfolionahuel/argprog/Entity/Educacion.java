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
    private int añoInicio;
    private int añoFin;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String nombreInsti, String nombreCarrera, int añoInicio, int añoFin) {
        this.nombreInsti = nombreInsti;
        this.nombreCarrera = nombreCarrera;
        this.añoInicio = añoInicio;
        this.añoFin = añoFin;
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

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public int getAñoFin() {
        return añoFin;
    }

    public void setAñoFin(int añoFin) {
        this.añoFin = añoFin;
    }
    
    

   

    
     
}
