package mymath;

import java.util.ArrayList;
import java.util.List;

public class EquationSolver {
    public Double linearEquation(double a, double b, double y)
            throws Exception {
        if (a==0) //return null;
            throw new Exception("No solutions");
        return (y-b)/a;
    }

    public List<Double> quadraticEquation(double a, double b,
                                          double c, double y){
        List<Double> sol = new ArrayList<Double>();
        //TODO
        return sol;
    }

}
