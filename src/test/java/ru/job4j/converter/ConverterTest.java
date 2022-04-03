package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert190RblThen2Euro() {
        float in = 190;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert10EurThen950Rub() {
        float in = 10;
        float expected = 950;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert350RblThen4dot069Dol() {
        float in = 344;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert45DolThen3870Rub() {
        float in = 45;
        float expected = 3870;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert75EurThen82dot5Dol() {
        float in = 75;
        float expected = 82.5f;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert89DolThen80dot1Euro() {
        float in = 89;
        float expected = 80.1f;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}