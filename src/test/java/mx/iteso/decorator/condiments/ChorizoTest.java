package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class ChorizoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }


    @Test
    public void testCostRegular(){
        Taco chorizo = new Chorizo(taco);
        double cost = chorizo.cost();
        assertEquals(9.5, cost,0);
    }


    @Test
    public void testDescription(){
        Taco chorizo = new Chorizo(taco);
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal Regular de chorizo", desc);
    }
}
