import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OperationTest {
    private Operations operations = new Operations();

    @Test
    public void testSuma(){
        assertEquals(4, operations.suma(2,2));
        assertEquals(10, operations.suma(4,6));
        assertEquals(2000, operations.suma(-3000,5000));
    }

    @Test
    public void testResta(){
        assertEquals(5, operations.resta(10,5));
        assertEquals(-100, operations.resta(100, 200));
        assertEquals(-1000, operations.resta(-500, 500));
    }

    @Test
    public void testMultiplicacion(){
        assertEquals(10, operations.multiplicacion(2,5));
        assertEquals(100, operations.multiplicacion(10,10));
        assertEquals(-1000, operations.multiplicacion(-2, 500));

    }

    @Test
    public void testDivision(){
        assertEquals(new Double(10), operations.division(2, 20));
        assertEquals(new Double(-2), operations.division(2, -4));
        assertEquals(new Double(50), operations.division(10, 500));

    }

    @Test
    public void testRaiz(){
        assertEquals(new Double(3), operations.raiz(2, 9));


    }
}
