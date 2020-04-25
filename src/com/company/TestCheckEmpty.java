package com.company;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckEmpty {
    @Test
    public void testCheckFalse() {
        List listFalse = new List();
        listFalse.addLast(25.9);
        boolean result = listFalse.checkEmpty();
        Assert.assertFalse(result);

    }

    @Test
    public void testCheckTrue() {
        List list = new List();
        boolean result = list.checkEmpty();
        Assert.assertTrue(result);
    }
}

