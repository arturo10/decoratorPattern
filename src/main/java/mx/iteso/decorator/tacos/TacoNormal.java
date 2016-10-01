package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;

public class TacoNormal extends Taco {
    public TacoNormal(Utils.Size size)
    {
        this.setSize(size);
        description = "Taco Normal "  + this.getSize().toString();
    }

    @Override
    public double cost() {
        double cost=0.00;
        switch (this.getSize()) {
            case Mega:
                cost=10.00;
                break;
            case Regular:
                cost=8.00;
                break;
            case Mini:
                cost=7.00;
                break;
        }
        return cost;
    }
}
