package mainpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VectorOpeartionsTest {

    VectorOpeartions vO;

    @BeforeEach
    void setUp() {
        vO= new VectorOpeartions(2);
        //System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() {
        vO=null;
    }

    @Test
    void rotateVectorByPI2() {
        double[] v = new double[]{1.0, 0.0};
        double[] expected = new double[]{0.0, 1.0};
        double[] r = vO.rotateVector(Math.PI / 2, v);
    }
    @Test
    void vectorCrossMultiplicationBadDimension() throws Exception{
        double[] v = new double[] {1,0};
        double[] w = new double[] {0,1};
        assertThrows(Exception.class, () -> {vO.vectorCrossMultiplication(v,w);});
    }

    @Test
    void vectorCrossMultiplicationXxY() throws Exception{
        vO = new VectorOpeartions(3);
        double[] v = new double[] {1,0};
        double[] w = new double[] {0,1};
        double[] expected = new double[] {0,0,1};
        double[] result = vO.vectorCrossMultiplication(v,w);
        assertArrayEquals(expected,result,0.01);
    }
}