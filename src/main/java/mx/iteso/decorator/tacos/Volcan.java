package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;

public class Volcan extends Taco {
    public Volcan()
    {
        description = "Volcan Regular";
    }
    @Override
    public double cost() {
        return 7.00;
    }
}
