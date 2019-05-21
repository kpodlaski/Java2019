package mainpkg;

public class VectorOpeartions {
    private int dim = 2;

    public VectorOpeartions(int dim){
        this.dim=dim;
    }

    public double[] rotateVector(double angle, double[] v){
        double[] result = new double[dim];
        result[0]= Math.cos(angle)*v[0]+Math.sin(angle)*v[1];
        result[1]= -Math.cos(angle)*v[1]+Math.sin(angle)*v[0];
        return result;
    }

    public double[] vectorCrossMultiplication(double[] v1, double[] v2) throws Exception {
        if (dim<3) throw new Exception("Cannot operate on diminesion smaller than 3");
        double[] res = new double[dim];
        if (v1.length<3 || v2.length<3){
            res[0]=0;
            res[1]=0;
        }
        else {
            res[0] = v1[1] * v2[2] - v1[2] * v2[1];
            res[1] = v1[0] * v2[2] - v1[2] * v2[0];
        }
        res[2] = v1[0]*v2[1]-v1[1]*v2[0];
        return res;
    }
}
