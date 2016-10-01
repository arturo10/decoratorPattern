package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CebollaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCost(){
        Taco cebolla = new Cebolla(taco);
        double cost = cebolla.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco cebolla = new Cebolla(taco);
        String desc = cebolla.getDescription();
        assertEquals("Taco Normal Regular con cebolla", desc);
    }
}
