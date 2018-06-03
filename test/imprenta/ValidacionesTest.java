/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio Amor Gutiérrez
 */
public class ValidacionesTest {
    
    public ValidacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarTipoRelieve method, of class Validaciones.
     */
    @Test
    public void testValidarTipoRelieve() {
        System.out.println("validarTipoRelieve");
        
        String relieve = "FLEXOGRAFIA";
        boolean expResult = true;
        boolean result = Validaciones.validarTipoRelieve(relieve);
        assertEquals(expResult, result);
        
        relieve = "TIPOGRAFIA";
        expResult = true;
        result = Validaciones.validarTipoRelieve(relieve);
        assertEquals(expResult, result);
        
        relieve = "LITOGRAFIA";
        expResult = true;
        result = Validaciones.validarTipoRelieve(relieve);
        assertEquals(expResult, result);
        
        relieve = "sdf1g56";
        expResult = false;
        result = Validaciones.validarTipoRelieve(relieve);
        assertEquals(expResult, result);
        
        relieve = "";
        expResult = false;
        result = Validaciones.validarTipoRelieve(relieve);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarNombre method, of class Validaciones.
     */
    @Test
    public void testValidarNombre() {
        System.out.println("validarNombre");
        
        String nombre = "f235";
        boolean expResult = false;
        boolean result = Validaciones.validarNombre(nombre);
        assertEquals(expResult, result);
        
        nombre = "María";
        expResult = true;
        result = Validaciones.validarNombre(nombre);
        assertEquals(expResult, result);
        
        nombre = "José Antonio";
        expResult = true;
        result = Validaciones.validarNombre(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarDescripcion method, of class Validaciones.
     */
    @Test
    public void testValidarDescripcion() {
        System.out.println("validarDescripcion");
        
        String nombre = "m nbd234v43 '?  ed";
        boolean expResult = false;
        boolean result = Validaciones.validarDescripcion(nombre);
        assertEquals(expResult, result);
        
        nombre = "Esto es una descripción normal y breve";
        expResult = true;
        result = Validaciones.validarDescripcion(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarEntero method, of class Validaciones.
     */
    @Test
    public void testValidarEntero() {
        System.out.println("validarEntero");
        
        int numero = 0;
        boolean expResult = true;
        boolean result = Validaciones.validarEntero(numero);
        assertEquals(expResult, result);
        
        numero = -6;
        expResult = false;
        result = Validaciones.validarEntero(numero);
        assertEquals(expResult, result);

        numero = 1024;
        expResult = false;
        result = Validaciones.validarEntero(numero);
        assertEquals(expResult, result);
        
        numero = 17;
        expResult = true;
        result = Validaciones.validarEntero(numero);
        assertEquals(expResult, result);
        
        numero = 1000;
        expResult = true;
        result = Validaciones.validarEntero(numero);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarDimensiones method, of class Validaciones.
     */
    @Test
    public void testValidarDimensiones() {
        System.out.println("validarDimensiones");
        
        int numero = 0;
        boolean expResult = true;
        boolean result = Validaciones.validarDimensiones(numero);
        assertEquals(expResult, result);
        
        numero = 100;
        expResult = true;
        result = Validaciones.validarDimensiones(numero);
        assertEquals(expResult, result);
        
        numero = -51;
        expResult = false;
        result = Validaciones.validarDimensiones(numero);
        assertEquals(expResult, result);
        
        numero = 102;
        expResult = false;
        result = Validaciones.validarDimensiones(numero);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarVolumen method, of class Validaciones.
     */
    @Test
    public void testValidarVolumen() {
        System.out.println("validarVolumen");
        
        int numero = 0;
        boolean expResult = true;
        boolean result = Validaciones.validarVolumen(numero);
        assertEquals(expResult, result);
        
        numero = 400;
        expResult = true;
        result = Validaciones.validarVolumen(numero);
        assertEquals(expResult, result);
        
        numero = 265;
        expResult = true;
        result = Validaciones.validarVolumen(numero);
        assertEquals(expResult, result);
        
        numero = 650;
        expResult = false;
        result = Validaciones.validarVolumen(numero);
        assertEquals(expResult, result);
        
        numero = -8;
        expResult = false;
        result = Validaciones.validarVolumen(numero);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarCapacidadMaxima method, of class Validaciones.
     */
    @Test
    public void testValidarCapacidadMaxima() {
        testValidarVolumen();
    }

    /**
     * Test of validarNIF method, of class Validaciones.
     */
    @Test
    public void testValidarNIF() {
        System.out.println("validarNIF");
        
        String nif = "48562D";
        boolean expResult = false;
        boolean result = Validaciones.validarNIF(nif);
        assertEquals(expResult, result);
        
        nif = "sgsgsfd54";
        expResult = false;
        result = Validaciones.validarNIF(nif);
        assertEquals(expResult, result);
        
        nif = "78164953";
        expResult = false;
        result = Validaciones.validarNIF(nif);
        assertEquals(expResult, result);
        
        nif = "72149548C";
        expResult = true;
        result = Validaciones.validarNIF(nif);
        assertEquals(expResult, result);
        
        nif = "72149548A";
        expResult = false;
        result = Validaciones.validarNIF(nif);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarTlf method, of class Validaciones.
     */
    @Test
    public void testValidarTlf() {
        System.out.println("validarTlf");
        
        String tlf = "464168768";
        boolean expResult = false;
        boolean result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "9428565413545";
        expResult = false;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "+34659761248";
        expResult = false;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "485";
        expResult = false;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "gsdver";
        expResult = false;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "f54g1";
        expResult = false;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "942680367";
        expResult = true;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "648064097";
        expResult = true;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        
        tlf = "764320195";
        expResult = true;
        result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarDireccion method, of class Validaciones.
     */
    @Test
    public void testValidarDireccion() {
        System.out.println("validarDireccion");
        
        String direc = "C/La Asunción Nº102 Pincurrín, Cantabria";
        boolean expResult = true;
        boolean result = Validaciones.validarDireccion(direc);
        assertEquals(expResult, result);
        
        direc = "C\\La Asunción Nº102 Pincurrín, Cantabria";
        expResult = false;
        result = Validaciones.validarDireccion(direc);
        assertEquals(expResult, result);
        
        direc = "C/La Asunción Nº102555 Pincurrín, Cantabria";
        expResult = false;
        result = Validaciones.validarDireccion(direc);
        assertEquals(expResult, result);
        
        direc = "C/3254 4 Nºsiunb GD,sdaf5";
        expResult = false;
        result = Validaciones.validarDireccion(direc);
        assertEquals(expResult, result);
        
        direc = "g45f4cbv53gf  gfhh";
        expResult = false;
        result = Validaciones.validarDireccion(direc);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarColorTapas method, of class Validaciones.
     */
    @Test
    public void testValidarColorTapas() {
        System.out.println("validarColorTapas");
        
        String colorTapas = "ROJO";
        boolean expResult = true;
        boolean result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "VERDE";
        expResult = true;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "AZUL";
        expResult = true;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "BLANCO";
        expResult = true;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "NEGRO";
        expResult = true;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "MARRON";
        expResult = true;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "sdf1g56";
        expResult = false;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
        colorTapas = "";
        expResult = false;
        result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        
    }
    
}
