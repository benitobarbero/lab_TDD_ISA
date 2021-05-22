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

    }

    @Test
    public void testMultiplicacion(){

    }

    @Test
    public void testDivision(){

    }

    @Test
    public void testRaiz(){

    }
}
