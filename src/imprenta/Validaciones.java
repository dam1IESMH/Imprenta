/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author José Daniel Buenaga, Sergio Amor, Mario Pérez
 */
public class Validaciones {

    /**
     * Método para validar el tipo de relieve de impresión
     *
     * @param relieve
     * @return
     * @throws InvalidSurfaceException
     */
    public static Trabajo.tipoRelieve validarTipoRelieve(String relieve) throws InvalidSurfaceException {
        boolean correcto = false;
        for (Trabajo.tipoRelieve tr : Trabajo.tipoRelieve.values()) {
            if (relieve.equals(tr.toString())) {
                return Trabajo.tipoRelieve.valueOf(relieve.toUpperCase());
            }
        }
        throw new InvalidSurfaceException();
    }//Cierre del método

    /**
     * Método para validar el nombre del centro comercial
     *
     * @param nombre
     * @return
     */
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜçÇ\\s]{2,25}");
    }

    /**
     * Método para validar un entero
     *
     * @param numero
     * @return
     */
    public static boolean validarEntero(int numero) {
        boolean correcto = false;
        if ((numero < 1000) && (numero > 0)) {
            correcto = true;
        }
        return correcto;
    }

    /**
     * Método para validar las dimensiones de un poster
     *
     * @param numero
     * @return
     */
    public static boolean validarDimensiones(int numero) {
        boolean correcto = false;
        if ((numero < 100) && (numero > 0)) {
            correcto = true;
        }
        return correcto;
    }

    /**
     * Método para validar las dimensiones de un poster
     *
     * @param numero
     * @return
     */
    public static boolean validarVolumen(int numero) {
        boolean correcto = false;
        if ((numero < 100) && (numero > 0)) {
            correcto = true;
        }
        return correcto;
    }

    /**
     * Método para validar las dimensiones de un poster
     *
     * @param numero
     * @return
     */
    public static boolean validarCapacidadMaxima(int numero) {
        boolean correcto = false;
        if ((numero < 100) && (numero > 0)) {
            correcto = true;
        }
        return correcto;
    }

    /**
     * Método para validar un NIF
     *
     * @param nif
     * @return
     */
    public static boolean validarNIF(String nif) {
        boolean correcto = false;
        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher = pattern.matcher(nif);
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

    /**
     * Método para validar un teléfono
     *
     * @param tlf
     * @return
     */
    public static boolean validarTlf(String tlf) {
        return tlf.matches("[679][0-9]{8,8}");
    }

    /**
     * Método para validar una dirección
     *
     * @param direc
     * @return
     */
    public static boolean validarDireccion(String direc) {
        return direc.matches("C/[a-zA-ZñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜçÇ\\s]{2,15} ?([nN][?º][0-9]{1,4})"
                + " [a-zA-ZñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜçÇ\\s]{2,15}, [a-zA-ZñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜçÇ\\s]{2,15}");
    }

    /**
     * Método para validar el color de las tapas de los libros
     *
     * @param colorTapas
     * @return
     * @throws InvalidSurfaceException
     */
    public static Libro.Tapas validarColorTapas(String colorTapas) throws InvalidSurfaceException {

        for (Libro.Tapas t : Libro.Tapas.values()) {
            if (colorTapas.equals(Libro.Tapas.values().toString())) {
                return Libro.Tapas.valueOf(colorTapas.toUpperCase());
            }
        }
        throw new InvalidSurfaceException();
    }//Cierre del método
}
