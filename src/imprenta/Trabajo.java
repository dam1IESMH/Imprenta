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
  * La clase {@code Trabajo} es una clase padre de la que heredan (Rotulo,
  * Poster y Libro). El trabajo tiene el atributo enum {@code tipoRelieve};
 * el atributo entero (@code id); los Calendar {@code fechaSolicitud},
 * {@code fechaImpresion}, {@code fechaRecogida}; y un boolean
 * {@code valido}.
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

    {
        fechaSolicitud.setLenient(false);
    }

    /**
     * Inicializa un objeto {@code Trabajo} con sus variables sin inicializar.
     */
    public Trabajo() {
    }

    /**
     * Inicializa un objeto {@code Trabajo} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param fechaSolicitud (@code Calendar)
     * @param tipoRelieve (@code enum)
     * @param fechaImpresion (@code Calendar)
     * @param fechaRecogida (@code Calendar)
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
    }

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
    }

    /**
     * Este método se utiliza para cambiar a apto un trabajo.
     *
     */
    public void valido() {
        this.valido = true;
    }

    /**
     * Este método se utiliza para poner que una impresión se ha llevado a cabo.
     *
     */
    public void imprimir() {
        this.impreso = true;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", tipoRelieve=" + Relieve + ", fechaImpresion=" + fechaImpresion + ", fechaRecogida=" + fechaRecogida + '}';
    }

}

