package com.gupao.pattern.factory.simplefactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by huangcheng on 2019/4/25.
 */
public class SimpleFactoryTest
{
    @Test
    public void testSimpleFactory() {
        String expect = "Hello World";
        String result = "Hello World";
        Assert.assertEquals(expect, result);
    }
}
