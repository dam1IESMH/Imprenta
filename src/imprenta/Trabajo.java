/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.io.Serializable;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Daniel Buenaga
 */
public class Trabajo implements Serializable {

    enum tipoRelieve {
        FLEXOGRAFIA, TIPOGRAFIA, LITOGRAFIA
    }
    protected int id;
    protected Calendar fechaSolicitud;
    protected tipoRelieve Relieve;
    protected Calendar fechaImpresion;
    protected Calendar fechaRecogida;
    protected boolean valido;
    protected boolean impreso;

    protected static int auto_incrementado = 0;

    {
        auto_incrementado++;
    }

    /**
     * Constructor vacio
     */
    public Trabajo() {
    }

    /**
     * Constructor para la clase Trabajo con todos los parámetros
     *
     * @param fechaSolicitud
     * @param tipoRelieve
     * @param fechaImpresion
     * @param fechaRecogida
     */
    public Trabajo(Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        try {
            this.id = auto_incrementado;
            this.fechaSolicitud = fechaSolicitud;
            this.Relieve = Validaciones.validarTipoRelieve(tipoRelieve);
            this.fechaImpresion = fechaImpresion;
            this.fechaRecogida = fechaRecogida;
        } catch (InvalidSurfaceException ex) {
            Logger.getLogger(Trabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Cierre del constructor

    /**
     * Inicializa un objeto {@code Trabajo} cuyas variables copia de otro objeto
     * Trabajo pasado como argumento
     *
     * @param t {@code Trabajo}
     */
    public Trabajo(Trabajo t) {
        this.id = t.id;
        this.fechaSolicitud = t.fechaSolicitud;
        this.Relieve = t.Relieve;
        this.fechaImpresion = t.fechaImpresion;
        this.fechaRecogida = t.fechaRecogida;
    }//Cierre del constructor

    public void valido() {
        this.valido = true;
    }

    public void imprimir() {
        this.impreso = true;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", tipoRelieve=" + Relieve + ", fechaImpresion=" + fechaImpresion + ", fechaRecogida=" + fechaRecogida + '}';
    }

}//Cierre de la clase

