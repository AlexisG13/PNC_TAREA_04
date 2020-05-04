package com.uca.tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

    @Size(min = 12, max = 12, message = "El campo código de productivo universal debe tener una longitud de 12 caracteres.")
    String UPC;

    @Size(min = 1, max = 100, message = "El campo nombre de producto debe tener una longitud maxima de 100 caracteres.")
    String nombre;

    @Size(min = 1, max = 100, message = "El campo marca debe tener una longitud maxima de 100 caracteres.")
    String marca;

    @Size(min = 1, max = 500, message = "El campo código de productivo universal debe tener una longitud maxima de 500 caracteres.")
    String descripcion;

    @Digits(fraction = 0, integer = 100)
    int existencias;

    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$", message = "El formato de la fecha debe de ser dd/mm/yyyy")
    String fechaIngreso;

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String uPC) {
        UPC = uPC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
