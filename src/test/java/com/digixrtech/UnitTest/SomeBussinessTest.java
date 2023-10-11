package com.digixrtech.UnitTest;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class SomeBussinessTest {
    @Test
    public void calculateSum_basics(){
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        int actualresult = bussiness.calculateSum(new int[] {1,2,3});
        int expectedresult = 6;
        assertEquals(expectedresult,actualresult);

    }
    @Test
    public void calculateSum_empty(){
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        int actualresult = bussiness.calculateSum(new int[] {});
        int expectedresult = 0;
        assertEquals(expectedresult,actualresult);

    }


}
