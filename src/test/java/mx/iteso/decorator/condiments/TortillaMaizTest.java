package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class TortillaMaizTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCostRegular(){
        Taco tortillaMaiz = new TortillaMaiz(taco);
        double cost = tortillaMaiz.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco tortillaMaiz = new TortillaMaiz(taco);
        String desc = tortillaMaiz.getDescription();
        assertEquals("Taco Normal Regular en tortilla de maíz", desc);
    }
}
