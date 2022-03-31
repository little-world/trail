package io.littleworld;

import java.awt.*;

public class Pixel implements Shape {

  public int x, y;

  Color color;

  @Override
  public void draw() {
    System.out.println("in Pixel");
    x = 3;
  }

}
