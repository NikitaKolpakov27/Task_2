package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestRemoveFromTo {
    @Test
    public void testRemoveFromTo_1() throws Exception {
        List list = new List();
        list.addLast(12.3);
        list.addLast(56.87);
        list.addLast(78.4);
        list.addLast(32.67);
        list.addLast(22.45);
        list.addLast(17.9);
        list.removeFromTo(1,3);
        Assert.assertEquals(3, list.size);
        Assert.assertEquals(list.getHeadNextValue(), 22.45, 0.0);
    }

    @Test
    public void testRemoveFromTo_2() throws Exception {
        try {
            List list = new List();
            list.addLast(12.3);
            list.addLast(56.87);
            list.addLast(78.4);
            list.removeFromTo(1,3);
        } catch (IndexException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testRemoveFromTo_3() throws Exception {
        try {
            List list = new List();
            list.addLast(12.3);
            list.addLast(56.87);
            list.addLast(78.4);
            list.addLast(45.6);
            list.addLast(24.78);
            list.removeFromTo(4,3);
        } catch (IndexException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testRemoveFromTo_4() throws Exception {
        try {
            List list = new List();
            list.addLast(12.3);
            list.addLast(56.87);
            list.addLast(78.4);
            list.addLast(45.6);
            list.addLast(24.78);
            list.removeFromTo(3,3);
        } catch (IndexException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

}
