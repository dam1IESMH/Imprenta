/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;


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
    public static String validarNombre(String nombre) {

        if (nombre.matches("[a-zA-ZnÑ\\s]{2,25}")) {

        } else {
            System.out.println("El nombre introducido no es correcto");
        }
        return nombre;
    }

    public static int validarEntero(int numero) {

        if ((numero < 1000) && (numero > 0)) {

        }
        return numero;
    }
    
    public static int validarDimensiones(int numero) {

        if ((numero < 100) && (numero > 0)) {

        }
        return numero;
    }
}
