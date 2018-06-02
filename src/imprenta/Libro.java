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
public class Libro extends Trabajo {

    private int numeroPaginas;
    private String colorTapas; //enum?

    /**Constructor vacio
     * 
     */
    public Libro() {
    }//Cierre del constructor

    /**
     * Constructor para la clase Trabajo con todos los parámetros
     * 
     * @param numeroPaginas
     * @param colorTapas
     * @param id
     * @param fechaSolicitud
     * @param tipoRelieve
     * @param fechaImpresion
     * @param fechaRecogida 
     */
    public Libro(int numeroPaginas, String colorTapas, int id, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.numeroPaginas = Validaciones.validarEntero(numeroPaginas);
        this.colorTapas = colorTapas;
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
