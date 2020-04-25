package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestToArray {
    @Test
    public void testToArray() {
        List list = new List();
        double[] array = {12.1, 34.6, 87.4, 78.5, 67.8};
        list.addLast(12.1);
        list.addLast(34.6);
        list.addLast(87.4);
        list.addLast(78.5);
        list.addLast(67.8);
        Assert.assertArrayEquals(list.toArray(), array, 0.0);
    }
}
