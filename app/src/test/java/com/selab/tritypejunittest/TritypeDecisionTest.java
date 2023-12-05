package com.selab.tritypejunittest;

import org.junit.Test;

import static org.junit.Assert.*;
/**选择
 * if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 ||
 *                     Side1+Side3 <= Side2)
 *                 triOut = 4;
 *             else
 *                 triOut = 1;*/
public class TritypeDecisionTest {
    @Test
    public void testTriangleDecisionTrue() {
        int result = Tritype.Triang(3, 4, 7); // You may need to adjust the values based on your test case
        assertEquals(4, result); // Ensure the decision is covered
    }
    @Test
    public void testTriangleDecisionFalse() {
        int result = Tritype.Triang(3, 4, 5); // You may need to adjust the values based on your test case
        assertEquals(1, result); // Ensure the decision is covered
    }
}
