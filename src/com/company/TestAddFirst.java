package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestAddFirst {
    @Test
    public void testAddFirst_1() {
        List list = new List();
        list.addFirst(12.3);
        list.addFirst(13.4);
        list.addFirst(56.7);
        Assert.assertEquals(56.7, list.getHeadValue(), 0.0);
        Assert.assertEquals(12.3, list.getTailValue(), 0.0);

    }

    @Test
    public void testAddFirst_2() {
        List list = new List();
        list.addFirst(11.2);
        Assert.assertSame(list.getHead(), list.getTail());
    }

    @Test
    public void testAddFirst_3() {
        List list = new List();
        Assert.assertNull(list.getHead());
        Assert.assertNull(list.getTail());
    }
}
