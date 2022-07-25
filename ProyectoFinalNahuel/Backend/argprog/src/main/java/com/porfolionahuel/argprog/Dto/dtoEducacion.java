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
    private int añoInicio;
    @NotBlank
    private int añoFin;
    
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreInsti, String nombreCarrera, int añoInicio, int añoFin) {
        this.nombreInsti = nombreInsti;
        this.nombreCarrera = nombreCarrera;
        this.añoInicio = añoInicio;
        this.añoFin = añoFin;
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
