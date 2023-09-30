/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2;

public class Circle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("I am a Circle and my draw method called.");
    }
}
