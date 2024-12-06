
/*
The program reads two command line arguments:
   - The name of a file from the command line.
     The file should be a PNG, GIF, or JPEG file containing an image.
   - A double alpha in the interval [0, 1]

The program creates a Picture with the image in the file and mixes
the color in each pixel with white. The command line argument alpha
is the factor for white in the mix.

The program shows the ligther image in a window.


Your task is to complete the code for the methods lighter
and main.

You should use the method mix defined in E2.java
to calculate the mix of two colors.
*/
import java.awt.Color;

public class E7 {

  public static void lighter(Picture pic, double alpha) {
    int width = pic.width();
    int height = pic.height();

    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        Color originalColor = pic.get(x, y);
        Color white = new Color(255, 255, 255);
        Color lighterColor = E2.mix(alpha, originalColor, white);
        pic.set(x, y, lighterColor);
      }
    }
  }
  

  public static void main(String[] args) {
      String fileName = args[0];
      double alpha = Double.parseDouble(args[1]);
      Picture p = new Picture(fileName);

      lighter(p, alpha);

      // Do not remove these function calls
      p.show();
      p.save("E7.png");
    }
}
