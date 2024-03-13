/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;

/**
 *
 * @author Patricio Salamanaca
 */
public class TipoVehiculo {
    private int idTipoVehiculo; 
   private String descripcion;

    public TipoVehiculo() {
    }

    public TipoVehiculo(int idTipoVehiculo, String descripcion) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.descripcion = descripcion;
    }

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
