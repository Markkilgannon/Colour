package org.example;


public class Colour {
    public static final int Maximum = 255;

    public final int red;
    public final int green;
    public final int blue;

    public Colour(double percentageR, double percentageG, double percentageB) {
        this.red = Math.toIntExact(Math.round(Maximum * percentageR));
        this.green = Math.toIntExact(Math.round(Maximum * percentageG));
        this.blue = Math.toIntExact(Math.round(Maximum * percentageB));



    }

    public Colour(int rgbValue) {
        red =  rgbValue % (Maximum + 1);
        rgbValue /= (Maximum + 1);
        green = rgbValue % (Maximum + 1);
        rgbValue /= (Maximum + 1);
        blue = rgbValue % (Maximum + 1);
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }


    public boolean equals(Object c) {
        if (this == c) return true;
        if (c == null) return false;
        Colour colour = (Colour) c;
        return red == colour.red && green == colour.green && blue == colour.blue;


    }


    public String colourCode() {
        String r = Integer.toString(red);
        String g = Integer.toString(green);
        String b = Integer.toString(blue);
        String colourCode = r + g + b;
        return colourCode;
    }
}