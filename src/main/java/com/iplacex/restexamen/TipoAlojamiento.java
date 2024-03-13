/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;

/**
 *
 * @author Robinson Concha
 */
    public class TipoAlojamiento {
    private int idTipoAlojamiento;
    private String descripcion;
    

    public TipoAlojamiento() {
    }

    public TipoAlojamiento(int idTipoAlojamiento, String descripcion) {
        this.idTipoAlojamiento = idTipoAlojamiento;
        this.descripcion = descripcion;
    }

    public int getIdTipoAlojamiento() {
        return idTipoAlojamiento;
    }

    public void setIdTipoAlojamiento(int idTipoAlojamiento) {
        this.idTipoAlojamiento = idTipoAlojamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
}

