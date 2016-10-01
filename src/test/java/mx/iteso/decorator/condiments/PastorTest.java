package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class PastorTest {


    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCostRegular(){
        Taco pastor = new Pastor(taco);
        double cost = pastor.cost();
        assertEquals(9.5, cost,0);
    }

    @Test
    public void testDescription(){
        Taco pastor = new Pastor(taco);
        String desc = pastor.getDescription();
        assertEquals("Taco Normal Regular de pastor", desc);
    }
}
