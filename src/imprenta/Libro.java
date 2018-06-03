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
public class Libro extends Trabajo {

    enum Tapas {
        ROJO, VERDE, AZUL, AMARILLO, BLANCO, NEGRO, MARRON, NARANJA
    }
    private int numeroPaginas;
    private Tapas colorTapas;

    /**
     * Constructor vacio
     *
     */
    public Libro() {
    }//Cierre del constructor

    /**
     * Constructor para la clase Trabajo con todos los parámetros
     *
     * @param numeroPaginas
     * @param colorTapas
     * @param fechaSolicitud
     * @param tipoRelieve
     * @param fechaImpresion
     * @param fechaRecogida
     */
    public Libro(int numeroPaginas, String colorTapas, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        super(fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        try {
            if (Validaciones.validarEntero(numeroPaginas)) {
                this.numeroPaginas = numeroPaginas;
            }
            this.colorTapas = Validaciones.validarColorTapas(colorTapas);
        } catch (InvalidSurfaceException ex) {
            Logger.getLogger(Trabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Cierre del constructor

    /**
     * Inicializa un objeto {@code Libro} cuyas variables copia de otro objeto
     * Libro pasado como argumento
     *
     * @param l {@code Libro}
     */
    public Libro(Libro l) {
        super(l);
        this.numeroPaginas = l.numeroPaginas;
        this.colorTapas = l.colorTapas;
    }//Cierre del constructor

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "numeroPaginas=" + numeroPaginas + ", colorTapas=" + colorTapas + '}';
    }

}//Cierre de la clase
