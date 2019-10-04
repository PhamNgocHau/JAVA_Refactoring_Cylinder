package vn.codegym;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertEquals;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0, 0)")
    public void testGetVolume0And0() {
        int radius = 3;
        int height = 7;
        double expected = 188.4955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    public void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
