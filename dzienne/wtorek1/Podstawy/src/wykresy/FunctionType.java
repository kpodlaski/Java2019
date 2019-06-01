package wykresy;

public enum FunctionType {

    Linear("linear"),
    Quadratic("quadratic"),
    Exponential("exponential");

    private String label;

    FunctionType(String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }
}
