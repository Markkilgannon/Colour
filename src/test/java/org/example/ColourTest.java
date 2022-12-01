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

    @Test

    //Test should pass if getBlue can handle these values
    //Black is a representation of no colour


    public void zeroTestBlue() {
        Colour black = new Colour(0.0, 0.0, 0.0);
        Assertions.assertEquals(0.0, black.getBlue());
    }

    @Test

    //Test should pass if getRed can handle these values
    //1.0 1.0 1.0 is a representation of white
    public void OnesTestRed() {
        Colour white = new Colour(1.0, 1.0, 1.0);
        Assertions.assertEquals(Colour.Maximum, white.getRed());
    }




}
