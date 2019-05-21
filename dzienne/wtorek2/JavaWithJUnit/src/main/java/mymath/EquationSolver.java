package mymath;

import java.util.ArrayList;
import java.util.List;

public class EquationSolver {

    public double solveLinearEquation(double a, double b, double y)
            throws Exception {
        if (a==0) {
            throw new Exception("No solutions exist");
        }
        return (y-b)/a;
    }

    public List<Double> solveQuadraticEquation
            (double a, double b, double c, double y){
        return new ArrayList<Double>();
    }
}
