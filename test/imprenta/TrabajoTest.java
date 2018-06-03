/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josed
 */
public class TrabajoTest {
    
    public TrabajoTest() {
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
     * Test of getId method, of class Trabajo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Trabajo instance = new Trabajo();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSolicitud method, of class Trabajo.
     */
    @Test
    public void testGetFechaSolicitud() {
        System.out.println("getFechaSolicitud");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.getFechaSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelieve method, of class Trabajo.
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
     * Test of getFechaImpresion method, of class Trabajo.
     */
    @Test
    public void testGetFechaImpresion() {
        System.out.println("getFechaImpresion");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.getFechaImpresion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRecogida method, of class Trabajo.
     */
    @Test
    public void testGetFechaRecogida() {
        System.out.println("getFechaRecogida");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.getFechaRecogida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValido method, of class Trabajo.
     */
    @Test
    public void testIsValido() {
        System.out.println("isValido");
        Trabajo instance = new Trabajo();
        boolean expResult = false;
        boolean result = instance.isValido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isImpreso method, of class Trabajo.
     */
    @Test
    public void testIsImpreso() {
        System.out.println("isImpreso");
        Trabajo instance = new Trabajo();
        boolean expResult = false;
        boolean result = instance.isImpreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMods method, of class Trabajo.
     */
    @Test
    public void testGetMods() {
        System.out.println("getMods");
        Trabajo instance = new Trabajo();
        ArrayList<Modificacion> expResult = null;
        ArrayList<Modificacion> result = instance.getMods();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMods method, of class Trabajo.
     */
    @Test
    public void testSetMods() {
        System.out.println("setMods");
        ArrayList<Modificacion> mods = null;
        Trabajo instance = new Trabajo();
        instance.setMods(mods);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaImpresion method, of class Trabajo.
     */
    @Test
    public void testSetFechaImpresion() {
        System.out.println("setFechaImpresion");
        Calendar fechaImpresion = null;
        Trabajo instance = new Trabajo();
        instance.setFechaImpresion(fechaImpresion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRecogida method, of class Trabajo.
     */
    @Test
    public void testSetFechaRecogida() {
        System.out.println("setFechaRecogida");
        Calendar fechaRecogida = null;
        Trabajo instance = new Trabajo();
        instance.setFechaRecogida(fechaRecogida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValido method, of class Trabajo.
     */
    @Test
    public void testSetValido() {
        System.out.println("setValido");
        boolean valido = false;
        Trabajo instance = new Trabajo();
        instance.setValido(valido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImpreso method, of class Trabajo.
     */
    @Test
    public void testSetImpreso() {
        System.out.println("setImpreso");
        boolean impreso = false;
        Trabajo instance = new Trabajo();
        instance.setImpreso(impreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar method, of class Trabajo.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        Trabajo instance = new Trabajo();
        instance.validar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Trabajo.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        Trabajo instance = new Trabajo();
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabajo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajo instance = new Trabajo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
