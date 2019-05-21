package mymath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EquationSolverTest {

    EquationSolver eqS;
    @Before
    public void setUp() throws Exception {
        eqS= new EquationSolver();
        //System.out.println("PREPARATION");
    }

    @After
    public void tearDown() throws Exception {
        //System.out.println("LIQVIDATION");
    }

    @Test(expected = Exception.class)
    /*
        a=0, b=3, y=17
     */
    public void solveLinearEquation() throws Exception {
        double a = 0, b=3, y=17;
        double r = eqS.solveLinearEquation(a,b,y);
    }

    @Test()
    /*
        a=10, b=0, y=17
     */
    public void solveLinearEquation2() throws Exception {
        double a = 10, b=0, y=17;
        double r = eqS.solveLinearEquation(a,b,y);
        assertEquals(1.7,r,0.0001);
    }

    @Test()
    /*
        a=10, b=-30, y=0
     */
    public void solveLinearEquation3() throws Exception {
        double a = 10, b=-30, y=0;
        double r = eqS.solveLinearEquation(a,b,y);
        assertEquals(3,r,0.0001);
    }

    @Test()
    public void solveQuadraticEquation() {
        double a=0, b=0, c=0, y=12;
        List<Double> r = eqS.solveQuadraticEquation(a,b,c,y);
        assertTrue(r.size()==0);
    }

    @Test()
    public void solveQuadraticEquation2() {
        double a=1, b=0, c=0, y=16;
        List<Double> r = eqS.solveQuadraticEquation(a,b,c,y);
        assertTrue(r.size()==2);
        assertEquals(-4,r.get(0),0.001);
        assertEquals(4,r.get(1),0.001);
    }

}