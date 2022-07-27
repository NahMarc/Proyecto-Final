/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreInsti;
    @NotBlank
    private String nombreCarrera;
    @NotBlank
    private String anoInicio;
    @NotBlank
    private String anoFin;
    
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreInsti, String nombreCarrera, String anoInicio, String anoFin) {
        this.nombreInsti = nombreInsti;
        this.nombreCarrera = nombreCarrera;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }
    
    //Getters y Setters

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
