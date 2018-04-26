/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Libro extends Trabajo{
    
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int numeroPaginas, int id, Date fechaSolicitud, String tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.numeroPaginas = numeroPaginas;
    }
    
    public Libro(Libro libro){
        
    }

    @Override
    public String toString() {
        return "Libro{" + "numeroPaginas=" + numeroPaginas + '}';
    }
    
}
