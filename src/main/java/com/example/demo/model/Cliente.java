package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "DUI")
    private String DUI;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "edad")
    private String edad;
    
    @Column(name = "direccion")
    private String direccion;
    
    //Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String Nombres) {
        this.nombres = Nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }
    public String getDUI() {
        return DUI;
    }
    public void setDUI(String _DUI) {
        this.DUI = _DUI;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String Edad) {
        this.edad = Edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }
}