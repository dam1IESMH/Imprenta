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
public class Poster extends Trabajo {

    //Campos de la clase 
    
    private int alto;
    private int ancho;
    private int numeroCopias;

    //Constructor vacio
    
    public Poster() {
    }//Cierre del constructor

    //Constructor para la clase Trabajo con todos los parámetros
    
    public Poster(int alto, int ancho, int numeroCopias, int id, Date fechaSolicitud, String tipoRelieve, Date fechaImpresion, Date fechaRecogida) {
        super(id, fechaSolicitud, tipoRelieve, fechaImpresion, fechaRecogida);
        this.alto = alto;
        this.ancho = ancho;
        this.numeroCopias = numeroCopias;
    }//Cierre del constructor

    public Poster(Poster p) {
        super(p);
        this.alto = p.alto;
        this.ancho = p.ancho;
        this.numeroCopias = p.numeroCopias;
    }

    @Override
    public String toString() {
        return "Poster{" + "alto=" + alto + ", ancho=" + ancho + ", numeroCopias=" + numeroCopias + '}';
    }
    
}//Cierre de la clase
