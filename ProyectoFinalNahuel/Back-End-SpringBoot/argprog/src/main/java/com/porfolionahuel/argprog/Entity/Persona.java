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
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nombre;
    private String apellido;
    private String titulo;
    private String sobremi;
    private String img;
    private String imgbanner;
    
    //Constructor

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String sobremi, String img, String imgbanner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.sobremi = sobremi;
        this.img = img;
        this.imgbanner = imgbanner;
    }

    //Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    
    
    

