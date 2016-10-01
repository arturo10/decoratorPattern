package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        double cost=taco.cost();
        switch (this.taco.getSize()) {
            case Mega:
                cost+=2.00;
                break;
            case Regular:
                cost+=1.50;
                break;
            case Mini:
                cost+=1.00;
                break;
        }
        return cost;
    }
}
