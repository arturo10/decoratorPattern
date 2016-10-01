package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class LenguaTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCostRegular(){
        Taco lengua = new Lengua(taco);
        double cost = lengua.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco lengua = new Lengua(taco);
        String desc = lengua.getDescription();
        assertEquals("Taco Normal Regular de lengua", desc);
    }
}
