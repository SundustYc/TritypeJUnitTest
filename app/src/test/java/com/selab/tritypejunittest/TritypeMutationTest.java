package com.selab.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriangleKillMutation1() {
        int result = TritypeMutantOne.Triang(3, 3, 7); // You may need to adjust the values based on your test case
        assertEquals(4, result); // Ensure the decision is covered
    }
    @Test
    public void testTriangleKillMutation2() {
        int result = TritypeMutantTwo.Triang(4, 4, 8); // You may need to adjust the values based on your test case
        assertEquals(4, result); // Ensure the decision is covered
    }
}
