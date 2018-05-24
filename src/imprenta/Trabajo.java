/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Daniel Buenaga
 */
public class Trabajo {

    //Campos de la clase 
    enum tipoRelieve{FLEXOGRAFIA,TIPOGRAFIA,LITOGRAFIA}
    protected int id;
    protected Calendar fechaSolicitud;
    protected tipoRelieve Relieve;
    protected Calendar fechaImpresion;
    protected Calendar fechaRecogida;

    //Constructor vacio
    public Trabajo() {
    }

    //Constructor para la clase Trabajo con todos los parámetros
    public Trabajo(int id, Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        this.id = id;
        this.fechaSolicitud = fechaSolicitud;
        this.Relieve = Relieve;
        this.fechaImpresion = fechaImpresion;
        this.fechaRecogida = fechaRecogida;
    }//Cierre del constructor

    public Trabajo(Trabajo t) {
        this.id = t.id;
        this.fechaSolicitud = t.fechaSolicitud;
        this.Relieve = t.Relieve;
        this.fechaImpresion = t.fechaImpresion;
        this.fechaRecogida = t.fechaRecogida;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", tipoRelieve=" + Relieve + ", fechaImpresion=" + fechaImpresion + ", fechaRecogida=" + fechaRecogida + '}';
    }


    public static boolean validarID(String DNI) {
        boolean correcto = false;

        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKE])");

        Matcher matcher = pattern.matcher(DNI);

        if (matcher.matches()) {

            String letra = matcher.group(2);

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            int index = Integer.parseInt(matcher.group(1));

            index = index % 23;

            String reference = letras.substring(index, index + 1);

            if (reference.equalsIgnoreCase(letra)) {

                correcto = true;

            } else {

                correcto = false;

            }

        } else {

            correcto = false;

        }

        return correcto;
    }
    
//    public static boolean validarFecha(Calendar fecha) {
//        try {
//            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
//            formatoFecha.setLenient(false);
//            formatoFecha.
//        } catch (ParseException e) {
//            return false;
//        }
//        return true;
//    }
    
    public static boolean validarTipoRelieve(String relieve){
        boolean valido = false;
        for (tipoRelieve tr : tipoRelieve.values()) {
            if( relieve == tipoRelieve.values().toString()){
                valido = true;
            }
        }
        return valido;
    }
    
}//Cierre de la clase

