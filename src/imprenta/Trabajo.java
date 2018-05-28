/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Daniel Buenaga
 */
public class Trabajo {

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

    {
        fechaSolicitud.setLenient(false);
    }

    /**
     * Constructor vacio
     */
    public Trabajo() {
    }

    /**
     * Constructor para la clase Trabajo con todos los parámetros
     * 
     * @param id
     * @param fechaSolicitud
     * @param tipoRelieve
     * @param fechaImpresion
     * @param fechaRecogida 
     */
    public Trabajo(int id, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        try {
            this.id = id;
            this.fechaSolicitud = fechaSolicitud;
            this.Relieve = validarTipoRelieve(tipoRelieve);
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

    /**
     * Método para validar el tipo de relieve de impresión
     * 
     * @param relieve
     * @return
     * @throws InvalidSurfaceException 
     */
    public static tipoRelieve validarTipoRelieve(String relieve) throws InvalidSurfaceException {

        for (tipoRelieve tr : tipoRelieve.values()) {
            if (relieve.equals(tipoRelieve.values().toString())) {
                return tipoRelieve.valueOf(relieve.toUpperCase());
            }
        }
        throw new InvalidSurfaceException();
    }//Cierre del método

}//Cierre de la clase

