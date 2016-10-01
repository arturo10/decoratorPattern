package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class CilantroTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }


    @Test
    public void testCostRegular(){
        Taco cilantro = new Cilantro(taco);
        double cost = cilantro.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco cilantro = new Cilantro(taco);
        String desc = cilantro.getDescription();
        assertEquals("Taco Normal Regular con cilantro", desc);
    }
}
