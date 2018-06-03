/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;

/**
 *
 * @author Jose Daniel Buenaga
 */
public class Poster extends Trabajo {

    private int alto;
    private int ancho;
    private int numeroCopias;

    /**
     * Constructor vacio
     */
    public Poster() {
    }//Cierre del constructor

    /**
     * Constructor para la clase Trabajo con todos los parámetros
     *
     * @param alto
     * @param ancho
     * @param numeroCopias
     * @param id
     * @param fechaSolicitud
     * @param tipoRelieve
     * @param fechaImpresion
     * @param fechaRecogida
     */
    public Poster(int alto, int ancho, int numeroCopias, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        super(fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        if ((Validaciones.validarDimensiones(alto)) && (Validaciones.validarDimensiones(ancho))) {
            this.alto = alto;
            this.ancho = ancho;
        }
        if (Validaciones.validarEntero(numeroCopias)) {
            this.numeroCopias = numeroCopias;
        }
    }//Cierre del constructor

    /**
     * Inicializa un objeto {@code Poster} cuyas variables copia de otro objeto
     * Poster pasado como argumento
     *
     * @param p {@code Poster}
     */
    public Poster(Poster p) {
        super(p);
        this.alto = p.alto;
        this.ancho = p.ancho;
        this.numeroCopias = p.numeroCopias;
    }//Cierre del constructor

    @Override
    public String toString() {
        return super.toString() + "Poster{" + "alto=" + alto + ", ancho=" + ancho + ", numeroCopias=" + numeroCopias + '}';
    }

}//Cierre de la clase
