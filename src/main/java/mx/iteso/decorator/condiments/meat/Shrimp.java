package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp (Taco taco){
        setTaco(taco);
    }

    public void setTaco(Taco taco){
        if(taco.getSize()== Utils.Size.Mini){
            throw new java.lang.IllegalArgumentException("Solo se puede asignar a un taco Mini");
        }
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        double cost=taco.cost();
        switch (this.taco.getSize()) {
            case Mega:
                cost+=2.00;
                break;
            case Regular:
                cost+=1.00;
                break;
        }
        return cost;
    }
}
