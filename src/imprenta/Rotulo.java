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
public class Rotulo extends Trabajo{
    
    //Campos de la clase 
    
    private String centroComercial;

    //Constructor vacio
    
    public Rotulo() {
    }//Cierre del constructor

    //Constructor para la clase Trabajo con todos los parámetros
    
    public Rotulo(String centroComercial, int id, Calendar fechaSolicitud, enum tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.centroComercial = centroComercial;
    }//Cierre del constructor

    public Rotulo(Rotulo r){
        super(r);
        this.centroComercial = r.centroComercial;
    }

    @Override
    public String toString() {
        return super.toString()+"Rotulo{" + "centroComercial=" + centroComercial + '}';
    }
    
}//Cierre de la clase
