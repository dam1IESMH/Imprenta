/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;

/**
 * La clase {@code Poster} es una clase que hereda de (@code Trabajo). 
 * El rotulo tiene los atributos heredados de Trabajo y además contiene los
 * atributos enteros (@code alto), (@code ancho), (@code numeroCopias).
 * 
 * @author Jose Daniel Buenaga
 */
public class Poster extends Trabajo {

    private int alto;
    private int ancho;
    private int numeroCopias;

    /**
     * Inicializa un objeto {@code Poster} con sus variables sin inicializar.
     */
    public Poster() {
    }

    /**
     * Inicializa un objeto {@code Poster} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param alto (@code int)
     * @param ancho (@code int)
     * @param numeroCopias (@code int)
     * @param fechaSolicitud (@code Calendar)
     * @param tipoRelieve (@code enum)
     * @param fechaImpresion (@code Calendar)
     * @param fechaRecogida (@code Calendar)
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
    }

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
    }

    @Override
    public String toString() {
        return super.toString() + "Poster{" + "alto=" + alto + ", ancho=" + ancho + ", numeroCopias=" + numeroCopias + '}';
    }

}
