package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestGet {
    @Test
    public void testGet_1() throws Exception {
        List list = new List();
        list.addLast(98.8);
        list.addLast(12.3);
        list.get(1);
        list.get(0);
        Assert.assertEquals(list.get(1), 12.3, 0.0);
        Assert.assertEquals(list.get(0), 98.8, 0.0);
    }

    @Test
    public void testGet_2() throws Exception {
        try {
            List list = new List();
            list.get(0);
        } catch (IndexException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }
}
