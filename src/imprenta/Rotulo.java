/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;

/**
 * La clase {@code Rotulo} es una clase que hereda de (@code Trabajo). 
 * El rotulo tiene los atributos heredados de Trabajo y además contiene el 
 * atributo String (@code centroComercial).
 * 
 * @author Jose Daniel Buenaga
 */
public class Rotulo extends Trabajo {

    private String centroComercial;

    /**
     * Inicializa un objeto {@code Rotulo} con sus variables sin inicializar.
     */
    public Rotulo() {
    }

    /**
     * Inicializa un objeto {@code Rotulo} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param centroComercial (@code String)
     * @param fechaSolicitud (@code Calendar)
     * @param tipoRelieve (@code enum)
     * @param fechaImpresion (@code Calendar)
     * @param fechaRecogida (@code Calendar)
     */
    public Rotulo(String centroComercial, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        super(fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        if (Validaciones.validarNombre(centroComercial)) {
            this.centroComercial = centroComercial;
        }
    }

    /**
     * Inicializa un objeto {@code Rotulo} cuyas variables copia de otro objeto
     * Rotulo pasado como argumento
     *
     * @param r {@code Rotulo}
     */
    public Rotulo(Rotulo r) {
        super(r);
        this.centroComercial = r.centroComercial;
    }

    @Override
    public String toString() {
        return super.toString() + "Rotulo{" + "centroComercial=" + centroComercial + '}';
    }

}
