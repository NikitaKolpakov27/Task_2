package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestAddLast {
    @Test
    public void testAddLast_1() {
        List list = new List();
        list.addLast(23.7);
        list.addLast(45.6);
        list.addLast(78.1);
        Assert.assertEquals(23.7, list.getHeadValue(), 0.0);
        Assert.assertEquals(78.1, list.getTailValue(), 0.0);

    }

    @Test
    public void testAddLast_2() {
        List list = new List();
        list.addLast(11.2);
        Assert.assertSame(list.getHead(), list.getTail());
    }

    @Test
    public void testAddLast_3() {
        List list = new List();
        Assert.assertNull(list.getHead());
    }

}

