/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String nombreProy;
    @NotBlank
    private String descriProy;
    @NotBlank
    private String imgProy;
    @NotBlank
    private String linkProy;
    
    //Constructores

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreProy, String descriProy, String imgProy, String linkProy) {
        this.nombreProy = nombreProy;
        this.descriProy = descriProy;
        this.imgProy = imgProy;
        this.linkProy = linkProy;
    }
    
    //Getters y Setters

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getDescriProy() {
        return descriProy;
    }

    public void setDescriProy(String descriProy) {
        this.descriProy = descriProy;
    }

    public String getImgProy() {
        return imgProy;
    }

    public void setImgProy(String imgProy) {
        this.imgProy = imgProy;
    }

    public String getLinkProy() {
        return linkProy;
    }

    public void setLinkProy(String linkProy) {
        this.linkProy = linkProy;
    }
    
    
}
