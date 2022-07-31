/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolionahuel.argprog.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class dtoPersona {
    @NotNull
    private String nombre;
    
    @NotNull
    private String apellido;
    
    @NotNull
    private String titulo;
    
    @NotNull
    private String sobremi;
    
    @NotNull
    private String img;
    
    @NotNull
    private String imgbanner;
    
    //Constructores

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String titulo, String sobremi, String img, String imgbanner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.sobremi = sobremi;
        this.img = img;
        this.imgbanner = imgbanner;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgbanner() {
        return imgbanner;
    }

    public void setImgbanner(String imgbanner) {
        this.imgbanner = imgbanner;
    }
    
}
