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

public class Testbang {
    @Test
    public void TT1() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", -1);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void TT2() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 1);
        Assert.assertEquals(output, "8.6 cm");
    }

    @Test
    public void TT3() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 3);
        Assert.assertEquals(output, "9 cm");
    }

    @Test
    public void TT4() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 5);
        Assert.assertEquals(output, "10.3 cm");
    }

    @Test
    public void TT5() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 7);
        Assert.assertEquals(output, "10.8 cm");
    }

    @Test
    public void TT6() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 9);
        Assert.assertEquals(output, "11.7 cm");
    }

    @Test
    public void TT7() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 12);
        Assert.assertEquals(output, "12.3 cm");
    }

    @Test
    public void TT8() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("M", 21);
        Assert.assertEquals(output, "Invalid Input");
    }

    @Test
    public void TT9() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", -1);
        Assert.assertEquals(output, "Invalid Input");
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
        String output = test.maxLength("FM", 3);
        Assert.assertEquals(output, "8.9 cm");
    }

    @Test
    public void TT12() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 5);
        Assert.assertEquals(output, "9.8 cm");
    }

    @Test
    public void TT13() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 7);
        Assert.assertEquals(output, "10.9 cm");
    }

    @Test
    public void TT14() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 9);
        Assert.assertEquals(output, "11.7 cm");
    }

    @Test
    public void TT15() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 12);
        Assert.assertEquals(output, "12.3 cm");
    }

    @Test
    public void TT16() {
        Kiemthuhopden test = new Kiemthuhopden();
        String output = test.maxLength("FM", 21);
        Assert.assertEquals(output, "Invalid Input");
    }
}
