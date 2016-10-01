package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Bistec;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class BistecTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCost(){
        Taco bistec = new Bistec(taco);
        double cost = bistec.cost();
        assertEquals(9.5, cost,0);
    }
    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        String desc = bistec.getDescription();
        assertEquals("Taco Normal Regular de bistec", desc);
    }
}
