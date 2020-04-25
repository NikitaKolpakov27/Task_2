package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestSize {
    @Test
    public void testSize_1() {
        List list = new List();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_2() {
        List list = new List();
        list.addLast(98.2);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testSize_3() {
        List list = new List();
        list.addLast(11.1);
        list.addLast(22.2);
        list.addLast(33.3);
        list.addLast(44.4);
        list.addLast(55.5);
        list.addLast(11.1);
        list.addLast(22.2);
        list.addLast(33.3);
        list.addLast(44.4);
        list.addLast(55.5);
        Assert.assertEquals(10, list.size());
    }
}
