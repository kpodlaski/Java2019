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
        if (a==0) {
            try {
                double s = linearEquation(b,c,y);
                sol.add(s);
            } catch (Exception e) {
                //Do not Add any solutions to the list
            }
        }
        else{
            double C = c-y;
            double delta = b*b-4*a*C;
            if (delta==0) {
                sol.add(-b/2/a);
            }
            else if(delta>0){
                delta = Math.sqrt(delta);
                sol.add((-b-delta)/2/a);
                sol.add((-b+delta)/2/a);
            }
        }
        return sol;
    }

    public List<double[]> multiLinearEquations(double[][] M, double T){
        List<double[]> sol = new ArrayList<double[]>();
        //TODO
        return sol;
    }

    private Double matrixDeterminant2D(double[][] m){
        if (m.length!=2 && m[0].length!=2){
            return null;
        }
        return (m[0][0]*m[1][1])-(m[1][0]*m[0][1]);
    }

}
