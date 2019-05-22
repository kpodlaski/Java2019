package mymath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EquationSolverTest {
    EquationSolver eqS;

    @Before
    public void setUp() throws Exception {
        eqS = new EquationSolver();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void linearEquation() throws Exception {
        double a=1, b=1, y=7;
        double r = eqS.linearEquation(a,b,y);
        assertEquals("Wrong Answer", 6, r,0.0001);
    }

    @Test(expected = Exception.class)
    public void linearEquation2() throws Exception {
        double a=0, b=1, y=7;
        double r = eqS.linearEquation(a,b,y);
        assertEquals("Wrong Answer", 6, r,0.0001);
    }

    @Test
    public void quadraticEquation() {
        double a=0, b=0, c=1, y=2;
        List<Double> res = eqS.quadraticEquation(a,b,c,y);
        assertEquals(0,res.size());
    }

    @Test
    public void quadraticEquation2() {
        double a=1, b=0, c=0, y=16;
        List<Double> res = eqS.quadraticEquation(a,b,c,y);
        assertEquals(2,res.size());
        assertEquals(-4,res.get(0),0.001);
        assertEquals(4,res.get(1),0.001);
    }

    @Test
    public void quadraticEquation3() {
        double a=1, b=1, c=1, y=0;
        List<Double> res = eqS.quadraticEquation(a,b,c,y);
        assertEquals(0,res.size());
    }

    @Test
    public void quadraticEquation4() {
        double a=1, b=2, c=3, y=2;
        List<Double> res = eqS.quadraticEquation(a,b,c,y);
        assertEquals(1,res.size());
        assertEquals(-1,res.get(0),0.001);
    }

    @Test
    public void matrixDeterminant2D() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        double[][] m = new double[][]{{1,2},{3,1}};
        Method method = eqS.getClass().getDeclaredMethod(
                "matrixDeterminant2D",
                m.getClass());
        System.out.println(method);
        method.setAccessible(true);
        Double d= (Double) method.invoke(eqS,(Object) m);
         //eqS.matrixDeterminant2D(m);
        assertEquals(-5,d.doubleValue(),0.001);
    }

}