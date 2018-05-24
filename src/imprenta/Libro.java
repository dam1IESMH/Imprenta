/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Date;


/**
 *
 * @author Jose Daniel Buenaga
 */
public class Libro extends Trabajo{
    
    //Campos de la clase 
    
    private int numeroPaginas;
    private String colorTapas;

    //Constructor vacio
    
    public Libro() {
    }//Cierre del constructor

    //Constructor para la clase Trabajo con todos los parámetros
    
    public Libro(int numeroPaginas, String colorTapas, int id, Date fechaSolicitud, String tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.numeroPaginas = numeroPaginas;
        this.colorTapas = colorTapas;
    }//Cierre del constructor
    
    public Libro(Libro l){
        super(l);
        this.numeroPaginas = l.numeroPaginas;
        this.colorTapas = l.colorTapas;
    }

    @Override
    public String toString() {
        return "Libro{" + "numeroPaginas=" + numeroPaginas + ", colorTapas=" + colorTapas + '}';
    }

}//Cierre de la clase
