/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.objetos_estructurasdatos1.Coches;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ed
 */
public class CochesTest {
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Se empiezan los Test");        
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Se han acabado los Test");
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testArrancarMotor() {
        Coches coche = new Coches("123ABC", 20000, 150);
        coche.arrancarMotor();
        assertTrue(coche.isArrancado());
    }

    @Test
    public void testApagarMotor() {
        Coches coche = new Coches("123ABC", 20000, 150);
        coche.arrancarMotor();
        coche.apagarMotor();
        assertFalse(coche.isArrancado());
    }

    @Test
    public void testAcelerar() {
        Coches coche = new Coches("123ABC", 20000, 150);
        coche.arrancarMotor();
        coche.acelerar(50);
        assertEquals(50, coche.getVelocidad());
    }

    @Test
    public void testFrenar() {
        Coches coche = new Coches("123ABC", 20000, 150);
        coche.arrancarMotor();
        coche.acelerar(50);
        coche.frenar(30);
        assertEquals(20, coche.getVelocidad());
    }

    @Test
    public void testFrenarApagarMotor() {
        Coches coche = new Coches("123ABC", 20000, 150);
        coche.arrancarMotor();
        coche.acelerar(50);
        coche.frenarApagarMotor();
        assertEquals(0, coche.getVelocidad());
        assertFalse(coche.isArrancado());
    }
}
