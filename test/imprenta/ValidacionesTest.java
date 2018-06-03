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
 * @author Sergio
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
        String relieve = "";
        boolean expResult = false;
        boolean result = Validaciones.validarTipoRelieve(relieve);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        String nombre = "";
        boolean expResult = false;
        boolean result = Validaciones.validarDescripcion(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarEntero method, of class Validaciones.
     */
    @Test
    public void testValidarEntero() {
        System.out.println("validarEntero");
        int numero = 0;
        boolean expResult = false;
        boolean result = Validaciones.validarEntero(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarDimensiones method, of class Validaciones.
     */
    @Test
    public void testValidarDimensiones() {
        System.out.println("validarDimensiones");
        int numero = 0;
        boolean expResult = false;
        boolean result = Validaciones.validarDimensiones(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarVolumen method, of class Validaciones.
     */
    @Test
    public void testValidarVolumen() {
        System.out.println("validarVolumen");
        int numero = 0;
        boolean expResult = false;
        boolean result = Validaciones.validarVolumen(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCapacidadMaxima method, of class Validaciones.
     */
    @Test
    public void testValidarCapacidadMaxima() {
        System.out.println("validarCapacidadMaxima");
        int numero = 0;
        boolean expResult = false;
        boolean result = Validaciones.validarCapacidadMaxima(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarNIF method, of class Validaciones.
     */
    @Test
    public void testValidarNIF() {
        System.out.println("validarNIF");
        String nif = "";
        boolean expResult = false;
        boolean result = Validaciones.validarNIF(nif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarTlf method, of class Validaciones.
     */
    @Test
    public void testValidarTlf() {
        System.out.println("validarTlf");
        String tlf = "";
        boolean expResult = false;
        boolean result = Validaciones.validarTlf(tlf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarDireccion method, of class Validaciones.
     */
    @Test
    public void testValidarDireccion() {
        System.out.println("validarDireccion");
        String direc = "";
        boolean expResult = false;
        boolean result = Validaciones.validarDireccion(direc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarColorTapas method, of class Validaciones.
     */
    @Test
    public void testValidarColorTapas() {
        System.out.println("validarColorTapas");
        String colorTapas = "";
        boolean expResult = false;
        boolean result = Validaciones.validarColorTapas(colorTapas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
