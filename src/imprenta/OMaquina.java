/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

/**
 *
 * @author usuario
 */
public class OMaquina extends Operario{
/**
 * Abertura del constructor vacio extendido de Operario
 */    
    public OMaquina() {
        super();
    }
/**
 *  Cierre del constructor vacio extendido de Operario
 */
/**
 * Abertura del constructor de parametros extendido de Operario
 * @param NIF
 * @param nombre
 * @param apellidos
 * @param telefono
 * @param direccion
 * @param senior 
 */    
    public OMaquina(String NIF, String nombre, String apellidos, String telefono, String direccion, boolean senior) {
        super(NIF, nombre, apellidos, telefono, direccion, senior);
    }
/**
 * Cierre del constructor de parametros extendido de Operario
 */
/**
 * Abertura del constructor de Objeto OMaquina extendido de Operario
 * @param om 
 */    
    public OMaquina(Operario o) {
        super(o);
    }
/**
 * Cierre del constructor de Objeto OMaquina extendido de Operario
 */
/**
 *  Metodo que realiza el relleno de las maquinas
 * @param m
 * @return 
 */  
    
//    public static boolean rellenarMaquina(Maquina m){
//        boolean rellenar;  //Atributo auxiliar
//       if(m.getVolumen=0){  //if que realiza la pregunta del volumen de tinta
//            rellenar=true;
//        }else{
//            rellenar=false;
//        }
//        return rellenar;  //Devuelve si es necesario o no rellenar la tinta
//    }
}