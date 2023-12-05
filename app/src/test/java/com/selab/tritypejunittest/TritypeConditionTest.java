package com.selab.tritypejunittest;

import org.junit.Test;

import static org.junit.Assert.*;
/**选择
 * if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 ||
 *                     Side1+Side3 <= Side2)
 *                 triOut = 4;
 *             else
 *                 triOut = 1;*/
public class TritypeConditionTest {
    @Test
    public void testTriangleTFF() {
        int result = Tritype.Triang(3, 4, 7); // You may need to adjust the values based on your test case
        assertEquals(4, result); // Ensure the decision is covered
    }
    @Test
    public void testTriangleFTF() {
        int result = Tritype.Triang(9, 4, 5); // You may need to adjust the values based on your test case
        assertEquals(4, result); // Ensure the decision is covered
    }
    @Test
    public void testTriangleFFT() {
        int result = Tritype.Triang(3, 8, 5); // You may need to adjust the values based on your test case
        assertEquals(4, result); // Ensure the decision is covered
    }
    @Test
    public void testTriangleFFF() {
        int result = Tritype.Triang(3, 4, 5); // You may need to adjust the values based on your test case
        assertEquals(1, result); // Ensure the decision is covered
    }
}
