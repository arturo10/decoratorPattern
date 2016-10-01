package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        double cost=taco.cost();
        switch (this.taco.getSize()) {
            case Mega:
                cost+=4.00;
                break;
            case Regular:
                cost+=2.00;
                break;
            case Mini:
                cost+=1.00;
                break;
        }
        return cost;

    }
}
