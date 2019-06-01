package wykresy;

public interface Function {

    public void setParameters(Double ... params) throws WrongSetOfParameters;
    public double valueAt(double x);
    public String description();
    public String[] parameters();

}
