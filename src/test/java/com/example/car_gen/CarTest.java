package com.example.car_gen;
import org.junit.Assert;
import org.junit.Test;


public class CarTest {

    Honda civic = new Honda("Black", 2005, 160, true);

    @Test
   public void testAccelerateSpeed() {
        Assert.assertEquals(160, civic.accelerateSpeed());
    }
    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(0, civic.decelerateSpeed());
    }
    @Test
    public void testConvertToElectric() {
        Assert.assertEquals(true, civic.convertToElectric());
    }
}
