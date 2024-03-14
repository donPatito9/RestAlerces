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
public class Usuario {
     private String userName;
    private String password;
    private String nombres;
    private String apellidos;

    public Usuario() {
    }

    public Usuario(String userName, String password, String nombres, String apellidos) {
        this.userName = userName;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

 
}
