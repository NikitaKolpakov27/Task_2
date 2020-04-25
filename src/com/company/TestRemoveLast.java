package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestRemoveLast {
    @Test
    public void testRemoveLast_1() throws Exception {
        List list = new List();
        list.addLast(35.5);
        list.addLast(98.6);
        list.addLast(74.3);
        list.removeLast();
        Assert.assertEquals(74.3, list.getTailValue(), 0.0);
    }

    @Test
    public void testRemoveLast_2() throws Exception {
        try {
            List list = new List();
            list.removeLast();
        } catch (NullPointerException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testRemoveLast_3() throws Exception {
        List list = new List();
        list.addLast(34.1);
        list.removeLast();
        Assert.assertSame(list.getHead(), list.getTail());
        Assert.assertNull(list.getHead());
        Assert.assertNull(list.getTail());
        Assert.assertEquals(0, list.size());
    }
}
