package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Fish;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class FishTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }


    @Test
    public void testCostRegular(){
        Taco fish = new Fish(taco);
        double cost = fish.cost();
        assertEquals(9.0, cost,0);
    }
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testMiniSize(){
        Taco tacoMini=new TacoNormal(Utils.Size.Mini );
        Taco taco=new Fish(tacoMini);
    }

    @Test
    public void testDescription(){
        Taco fish = new Fish(taco);
        String desc = fish.getDescription();
        assertEquals("Taco Normal Regular de pescado", desc);
    }


}
