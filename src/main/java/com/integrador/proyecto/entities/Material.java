package com.integrador.proyecto.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Cambiado a Integer

    @Column(name = "codcorrelativo", length = 3, nullable = false)
    private String codCorrelativo;

    @Column(name = "nombre", length = 75, nullable = false)
    private String nombre;

    @Column(name = "fecha_creacion")
    private java.time.LocalDate fechaCreacion;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "estado", length = 1)
    private String estado;

    @Column(name = "cod_contact", length = 6)
    private String codContact;

    @Column(name = "idgrupo")
    private Integer idGrupo;

    @Column(name = "idunidad")
    private Integer idUnidad;

    public Material(Integer id, String codCorrelativo, String nombre, LocalDate fechaCreacion, String descripcion, String estado, String codContact, Integer idGrupo, Integer idUnidad) {
        this.id = id;
        this.codCorrelativo = codCorrelativo;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.codContact = codContact;
        this.idGrupo = idGrupo;
        this.idUnidad = idUnidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodCorrelativo() {
        return codCorrelativo;
    }

    public void setCodCorrelativo(String codCorrelativo) {
        this.codCorrelativo = codCorrelativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodContact() {
        return codContact;
    }

    public void setCodContact(String codContact) {
        this.codContact = codContact;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }
}