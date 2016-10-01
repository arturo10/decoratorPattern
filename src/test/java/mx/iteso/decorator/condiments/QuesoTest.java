package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class QuesoTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCostRegular(){
        Taco queso = new Queso(taco);
        double cost = queso.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        String desc = queso.getDescription();
        assertEquals("Taco Normal Regular con queso", desc);
    }
}
