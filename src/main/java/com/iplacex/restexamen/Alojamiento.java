/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;

import java.util.Date;

/**
 *
 * @author Robinson Concha
 */
public class Alojamiento {
private String rut;
private String nombreAgrupacion;
public String idTipoVehiculo;
public String idTipoAlojamiento;
private Date fechaIngreso;
private int dias;

    public Alojamiento() {
        
    }

    public Alojamiento(String rut, String nombreAgrupacion, String idTipoVehiculo, String idTipoAlojamiento, Date fechaIngreso, int dias) {
        this.rut = rut;
        this.nombreAgrupacion = nombreAgrupacion;
        this.idTipoVehiculo = idTipoVehiculo;
        this.idTipoAlojamiento = idTipoAlojamiento;
        this.fechaIngreso = fechaIngreso;
        this.dias = dias;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreAgrupacion() {
        return nombreAgrupacion;
    }

    public void setNombreAgrupacion(String nombreAgrupacion) {
        this.nombreAgrupacion = nombreAgrupacion;
    }

    public String getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(String idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getIdTipoAlojamiento() {
        return idTipoAlojamiento;
    }

    public void setIdTipoAlojamiento(String idTipoAlojamiento) {
        this.idTipoAlojamiento = idTipoAlojamiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    }

    