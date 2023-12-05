package com.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class TritypeLineBranchTest {

    @Test
    public void testScaleneTriangle() {
        Tritype tri1 = new Tritype();
        assertEquals(1, tri1.Triang(3, 4, 5));
    }

    @Test
    public void testIsoscelesTriangl1() {
        Tritype tri2_1 = new Tritype();
        assertEquals(2, tri2_1.Triang(3, 3, 4));
    }
    @Test
    public void testIsoscelesTriangl2() {
        Tritype tri2_2 = new Tritype();
        assertEquals(2, tri2_2.Triang(3, 4, 3));
    }
    @Test
    public void testIsoscelesTriangl3() {
        Tritype tri2_3 = new Tritype();
        assertEquals(2, tri2_3.Triang(4, 3, 3));
    }

    @Test
    public void testEquilateralTriangle() {
        Tritype tri3 = new Tritype();
        assertEquals(3, tri3.Triang(2, 2, 2));
    }

    @Test
    public void testNotATriangle() {
        Tritype tri4 = new Tritype();
        assertEquals(4, tri4.Triang(1, 2, 3));
    }

    @Test
    public void testInvalidInput() {
        Tritype tri5 = new Tritype();
        assertEquals(4, tri5.Triang(0, 2, 3));
    }

    @Test
    public void testZeroSides() {
        Tritype tri6 = new Tritype();
        assertEquals(4, tri6.Triang(0, 0, 0));
    }

    @Test
    public void testNegativeSides() {
        Tritype tri7 = new Tritype();
        assertEquals(4, tri7.Triang(-1, -2, -3));
    }


    @Test
    public void testNonIntegerInput() {
        Tritype tri9 = new Tritype();
        System.setIn(new java.io.ByteArrayInputStream("abc\n".getBytes()));
        assertEquals(1, tri9.getN());
        System.setIn(System.in);
    }

    @Test
    public void testIOException() {
        Tritype tri10 = new Tritype();
        System.setIn(new java.io.InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Simulated IOException");
            }
        });

        assertEquals(1, tri10.getN());
        System.setIn(System.in);
    }
}