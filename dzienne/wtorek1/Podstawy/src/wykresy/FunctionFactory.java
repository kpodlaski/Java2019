package wykresy;

import wykresy.functions.ExponentialFunction;
import wykresy.functions.LinearFunction;
import wykresy.functions.QuadraticFunction;

public class FunctionFactory {
    Function generateFunction(FunctionType type){
        switch (type){
            case Linear : return new LinearFunction();
            case Quadratic: return new QuadraticFunction();
            case Exponential: return new ExponentialFunction();
            default: return null;
        }
    }
}
