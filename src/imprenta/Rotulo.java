/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jose Daniel Buenaga
 */
public class Rotulo extends Trabajo {

    private String centroComercial;

    /**
     * Constructor vacio
     */
    public Rotulo() {
    }//Cierre del constructor

    /**
     * Constructor para la clase Trabajo con todos los parámetros
     * 
     * @param centroComercial
     * @param id
     * @param fechaSolicitud
     * @param tipoRelieve
     * @param fechaImpresion
     * @param fechaRecogida 
     */
    public Rotulo(String centroComercial, int id, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.centroComercial = centroComercial;
    }//Cierre del constructor
    
    /**
     * Inicializa un objeto {@code Rotulo} cuyas variables copia de otro objeto
     * Rotulo pasado como argumento
     * 
     * @param r {@code Rotulo} 
     */
    public Rotulo(Rotulo r) {
        super(r);
        this.centroComercial = r.centroComercial;
    }//Cierre del constructor

    @Override
    public String toString() {
        return super.toString() + "Rotulo{" + "centroComercial=" + centroComercial + '}';
    }

}//Cierre de la clase
