/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;


/**
 * La clase {@code Libro} es una clase que hereda de (@code Trabajo). 
 * El rotulo tiene los atributos heredados de Trabajo y además contiene el
 * atributo enumerado (@code Tapas) y el entero (@code numeroPaginas); 
 * 
 * @author Jose Daniel Buenaga
 */
public class Libro extends Trabajo {

    enum Tapas {
        ROJO, VERDE, AZUL, BLANCO, NEGRO, MARRON
    }
    private int numeroPaginas;
    private Tapas colorTapas;

    /**
     * Inicializa un objeto {@code Libro} con sus variables sin inicializar.
     *
     */
    public Libro() {
    }

    /**
     * Inicializa un objeto {@code Libro} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param numeroPaginas (@code int)
     * @param Tapas (@code String)
     * @param fechaSolicitud (@code Calendar)
     * @param tipoRelieve (@code enum)
     * @param fechaImpresion (@code Calendar)
     * @param fechaRecogida (@code Calendar)
     */
    public Libro(int numeroPaginas, String Tapas, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        super(fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        if (Validaciones.validarEntero(numeroPaginas)) {
            this.numeroPaginas = numeroPaginas;
        }
        if (Tapas.equalsIgnoreCase("ROJO")) {
            colorTapas = colorTapas.ROJO;
        } else if (Tapas.equalsIgnoreCase("VERDE")) {
            colorTapas = colorTapas.VERDE;
        } else if (Tapas.equalsIgnoreCase("AZUL")) {
            colorTapas = colorTapas.AZUL;
        } else if (Tapas.equalsIgnoreCase("BLANCO")) {
            colorTapas = colorTapas.BLANCO;
        } else if (Tapas.equalsIgnoreCase("NEGRO")) {
            colorTapas = colorTapas.NEGRO;
        }else if (Tapas.equalsIgnoreCase("MARRON")) {
            colorTapas = colorTapas.MARRON;
    }
    }

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
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "numeroPaginas=" + numeroPaginas + ", colorTapas=" + colorTapas + '}';
    }

}
