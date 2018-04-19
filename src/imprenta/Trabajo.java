/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Trabajo {
    
    protected int id;
    protected Date fechaSolicitud;
    protected String tipoRelieve;
    protected Date fechaImpresion;
    protected Date fechaRecogida;

    public Trabajo() {
    }

    public Trabajo(int id, Date fechaSolicitud, String tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        this.id = id;
        this.fechaSolicitud = fechaSolicitud;
        this.tipoRelieve = tipoRelieve;
        this.fechaImpresion = fechaImpresion;
        this.fechaRecogida = fechaRecogida;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", tipoRelieve=" + tipoRelieve + ", fechaImpresion=" + fechaImpresion + ", fechaRecogida=" + fechaRecogida + '}';
    }
    
    
}
