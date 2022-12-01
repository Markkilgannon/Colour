package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTest {

    //Test should pass if getRed can handle these values
    //Black is a representation of no colour

    @Test

    public void zeroTestRed() {
        Colour black = new Colour(0.0, 0.0, 0.0);
        Assertions.assertEquals(0, black.getRed());
    }

    @Test

    //Test should pass if getGreen can handle these values
    //Black is a representation of no colour

    public void ZeroTestGreen() {
        Colour black = new Colour(0.0, 0.0, 0.0);
        Assertions.assertEquals(0, black.getGreen());
    }
}
