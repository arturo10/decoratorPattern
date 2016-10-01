package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;

public class Quesadilla extends Taco {

    public Quesadilla(Utils.Size size){
        this.setSize(size);
        description = "Quesadilla " + this.getSize().toString();

    }

    @Override
    public double cost() {
        double cost=0.00;
        switch (this.getSize()) {
            case Mega:
                cost=12.00;
                break;
            case Regular:
                cost=10.00;
                break;
            case Mini:
                cost=9.00;
                break;
        }
        return cost;
    }
}
