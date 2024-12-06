
/*
The program demonstrates a color and its complement.
It uses a static method
   complement
and draws a square with the original color and a smaller overlapped square
with the complement.

Your task is to complete the method
      complement.
*/
import java.awt.Color;

public class E3 {

  /*
   * The method returns a color where each component is calculated
   * as 255 - the corresponding component of the argument.
   */
  public static Color complement(Color c) {
    int r = 255 - c.getRed();
    int g = 255 - c.getGreen();
    int b = 255 - c.getBlue();
    return new Color(r, g, b);
  }

  /*
   * Demonstrates the complement of the color given by three integers.
   * The three integers should be provided in the command liner
   *
   * Do not change the main function
   */
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    Color col = new Color(r, g, b);
    StdDraw.setPenColor(col);
    StdDraw.filledSquare(0.5, 0.5, 0.25);
    StdDraw.setPenColor(complement(col));
    StdDraw.filledSquare(0.5, 0.5, 0.125);
    StdDraw.save("E3.png");
  }

}
