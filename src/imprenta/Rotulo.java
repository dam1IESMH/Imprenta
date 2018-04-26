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
public class Rotulo extends Trabajo{
    
    private String centroComercial;

    public Rotulo() {
    }

    public Rotulo(String centroComercial, int id, Date fechaSolicitud, String tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.centroComercial = centroComercial;
    }

    public Rotulo(Rotulo rotulo){
        
    }

    @Override
    public String toString() {
        return "Rotulo{" + "centroComercial=" + centroComercial + '}';
    }
    
    
}
