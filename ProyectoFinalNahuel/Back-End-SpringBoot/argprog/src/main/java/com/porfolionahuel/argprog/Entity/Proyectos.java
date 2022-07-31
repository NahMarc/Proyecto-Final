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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreProy;
    private String descriProy;
    private String imgProy;
    private String linkProy;
    
    //Constructores

    public Proyectos() {
    }

    public Proyectos(int id, String nombreProy, String descriProy, String imgProy, String linkProy) {
        
    }

    public Proyectos(String nombreProy, String descriProy, String imgProy, String linkProy) {
        this.nombreProy = nombreProy;
        this.descriProy = descriProy;
        this.imgProy = imgProy;
        this.linkProy = linkProy;
    }

    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
