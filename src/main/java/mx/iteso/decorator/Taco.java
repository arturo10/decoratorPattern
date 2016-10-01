package mx.iteso.decorator;
import mx.iteso.decorator.Utils;

public abstract class Taco {
    public String description = "Any Taco";
    private Utils.Size size;
    public Utils.Size getSize(){
        return this.size;
    }
    public void setSize(Utils.Size size){
         this.size=size;
    }
    public String getDescription(){
        return description;
    }
    public abstract double cost();

}
