/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Date;

/**
 *
 * @author Jose Daniel Buenaga
 */
public class Trabajo {

    //Campos de la clase 
    
    protected int id;
    protected Date fechaSolicitud;
    protected String tipoRelieve;
    protected Date fechaImpresion;
    protected Date fechaRecogida;

    //Constructor vacio
    
    public Trabajo() {
    }

    //Constructor para la clase Trabajo con todos los parámetros
    
    public Trabajo(int id, Date fechaSolicitud, String tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        this.id = id;
        this.fechaSolicitud = fechaSolicitud;
        this.tipoRelieve = tipoRelieve;
        this.fechaImpresion = fechaImpresion;
        this.fechaRecogida = fechaRecogida;
    }//Cierre del constructor

    public Trabajo(Trabajo t) {
        this.id = t.id;
        this.fechaSolicitud = t.fechaSolicitud;
        this.tipoRelieve = t.tipoRelieve;
        this.fechaImpresion = t.fechaImpresion;
        this.fechaRecogida = t.fechaRecogida;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", tipoRelieve=" + tipoRelieve + ", fechaImpresion=" + fechaImpresion + ", fechaRecogida=" + fechaRecogida + '}';
    }
    
}//Cierre de la clase
