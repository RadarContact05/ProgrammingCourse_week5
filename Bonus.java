/*
The library class NumericalArrays has to be in the same directory
as this program.

The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program then shows three images in three different windows:
  - The original image
  - A blured version of the image where the color in each pixel
    is a color with components obatained as the average of the
    components of the 9 colors around (and including) the pixel.
  - A sharper version of the image where the color in each pixel
    is a color with components obtained as the weighted average
    of the components of the 9 colours around (and including)
    the pixel. The weights are: 16 for the pixel itself and
     -1 for the 8 neighbours.

java Bonus baboon.jpg


*/

import java.awt.Color;

public class Bonus {

  /*
   * average(colors, weights) calculates a color as the weighted average of
   * the colors in the first argument using the weights in the second argument.
   *
   * The average color is a color with RGB components that are the average
   * of the corresponding RGB components. Each component might need to be
   * adjusted so that it stays in range (0-255).
   */
  private static Color average(Color[] colors, int[] weights) {
    // Your code here.
    // remove return new Color(0, 0, 0);
    return new Color(0, 0, 0);
  }

  /*
   * neighbours(x, y, p) calculates the array of nine colors around the pixel (x,
   * y) in pic.
   * Assume that 1 < x < pic.width - 1 and 1 < y < pic.height - 1.
   *
   */
  private static Color[] neighbours(int x, int y, Picture p) {
    // Your code here.
    // remove return new Color[]{};
    return new Color[] {};
  }

  // Do not change the main function
  public static void main(String[] args) {
    Picture p = new Picture(args[0]);
    Picture sharp = new Picture(p.width(), p.height());
    Picture blurry = new Picture(p.width(), p.height());
    Color[] nine = new Color[9];
    int[] ws = new int[9];

    for (int x = 1; x < p.width() - 1; x++) {
      for (int y = 1; y < p.height() - 1; y++) {

        nine = neighbours(x, y, p);

        ws = NumericalArrays.repeat(9, 1);
        blurry.set(x, y, average(nine, ws));

        ws = NumericalArrays.repeat(9, -1);
        ws[0] = 16;
        sharp.set(x, y, average(nine, ws));
      }
    }
    p.show();
    sharp.show();
    blurry.show();
    p.save("Bonus1.png");
    sharp.save("Bonus2.png");
    blurry.save("Bonus3.png");
  }
}
