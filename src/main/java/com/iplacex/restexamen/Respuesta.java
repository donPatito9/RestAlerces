/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;

import java.io.Serializable;

/**
 *
 * @author Robinson Concha
 */

    public class Respuesta implements Serializable {
    private int status;
    private Object data;

    public Respuesta() {
    }
    public Respuesta (int status) {
        this.status = status;
    }

    public Respuesta(int status, Object data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
}




