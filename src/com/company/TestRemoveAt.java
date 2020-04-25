package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestRemoveAt {
    @Test
    public void testRemoveAt_1() throws Exception {
        List list = new List();
        list.addLast(23.5);
        list.addLast(12.3);
        list.addLast(16.2);
        list.addLast(57.8);
        list.removeAt(16.2);
        Assert.assertEquals(3, list.size);
    }

    @Test
    public void testRemoveAt_2() throws Exception {
        try {
            List list = new List();
            list.removeAt(98.3);
        } catch (NullPointerException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testRemoveAt_3() throws Exception {
        try {
            List list = new List();
            list.addLast(34.6);
            list.addLast(12.8);
            list.addLast(92.2);
            list.removeAt(76.1);
        } catch (KeyException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }
}
