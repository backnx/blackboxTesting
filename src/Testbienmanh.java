/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import org.junit.Assert;
import org.junit.Test;

public class Testbienmanh {
    @Test
    public void TT1() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", -1);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void TT2() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 0);
        Assert.assertEquals(output, "8.6 cm");
    }

    @Test
    public void TT3() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 1);
        Assert.assertEquals(output, "8.6 cm");
    }

    @Test
    public void TT4() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 8);
        Assert.assertEquals(output, "11.9 cm");
    }

    @Test
    public void TT5() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 15);
        Assert.assertEquals(output, "12.6 cm");
    }

    @Test
    public void TT6() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 16);
        Assert.assertEquals(output, "12.6 cm");
    }

    @Test
    public void TT7() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 17);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void TT8() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", -1);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void TT9() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 0);
        Assert.assertEquals(output, "8.5 cm");
    }

    @Test
    public void TT10() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 1);
        Assert.assertEquals(output, "8.5 cm");
    }

    @Test
    public void TT11() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 8);
        Assert.assertEquals(output, "11.7 cm");
    }

    @Test
    public void TT12() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 15);
        Assert.assertEquals(output, "12.3 cm");
    }

    @Test
    public void TT13() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 16);
        Assert.assertEquals(output, "12.3 cm");
    }

    @Test
    public void TT14() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 17);
        Assert.assertEquals(output, "Invalid Input");
    }
}
