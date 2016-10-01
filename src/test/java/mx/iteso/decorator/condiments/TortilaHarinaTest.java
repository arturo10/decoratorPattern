package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Utils;
import mx.iteso.decorator.condiments.meat.Shrimp;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class TortilaHarinaTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Utils.Size.Regular);
    }

    @Test
    public void testCostRegular(){
        Taco harina = new TortillaHarina(taco);
        double cost = harina.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco harina = new TortillaHarina(taco);
        String desc = harina.getDescription();
        assertEquals("Taco Normal Regular en tortilla de harina", desc);
    }




}
