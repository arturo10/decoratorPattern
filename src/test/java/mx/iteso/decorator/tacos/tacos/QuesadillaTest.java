package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class QuesadillaTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new Quesadilla(Utils.Size.Regular);
    }

    @Test
    public void testCostRegular(){
        double cost = this.taco.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testDescription(){
        String desc = this.taco.getDescription();
        assertEquals("Quesadilla Regular", desc);
    }
}
