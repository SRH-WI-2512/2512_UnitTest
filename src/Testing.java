import org.junit.Assert;
import org.junit.Test;

public class Testing {

    @Test
    public void testMethode() {
        String str1 = "Hallo";
        String str2 = "Hallo";

        Assert.assertEquals("str1 und str2 sind gleich",
                str2, str1);
        Assert.assertSame("str1 und str1 sind identisch",
                str2, str1);
    }

    @Test
    public void nochEinTest() {
        boolean testBoolean = 17 > 0;
        int testInteger = 17 / 2;
        float testDouble = 0.1F;

        Assert.assertTrue( testBoolean );
        Assert.assertEquals( 8, testInteger );
        Assert.assertEquals( 0.1, testDouble, 0.00000001 );
    }

    @Test
    public void testeAutoKlasse() {
        Auto a1 = new Auto(2020, 100);

        Assert.assertEquals(a1.getBaujahr(), 2020);
        Assert.assertEquals( 4200 - 1260, a1.verkauswert(), 0.001 );
    }

}
