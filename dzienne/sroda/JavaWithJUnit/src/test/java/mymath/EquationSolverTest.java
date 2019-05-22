package mymath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

}