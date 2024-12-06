
/*
The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program creates a Picture with the image in the file,
inverts the image vertically and shows the inverted image
in a window.

More about the output can be found in the PDF with explanations.

*/
import java.awt.Color;

public class E5 {
  public static void main(String[] args) {
    String fileName = args[0];
    Picture p = new Picture(fileName);
    
    int width = p.width();
    int height = p.height();

    for (int y = 0; y < height / 2; y++) {
      for (int x = 0; x < width; x++) {
        Color topPixel = p.get(x, y);
        Color bottomPixel = p.get(x, height - y - 1);

        p.set(x, y, bottomPixel);
        p.set(x, height - y - 1, topPixel);
      }
    }

    // Do not remove these function calls
    p.show();
    p.save("E5.png");
  }
}
