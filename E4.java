
/*
The class Picture has to be in the same directory as this program.
It is included in the zip file.

The program reads two integer values w and h from the command line
and creates a picture of size w x h with random colors.

A random color is a color with random red, green and blue components.

The program ends by showing the picture in a window.

More details about the output in the PDF file with explanations for each exercise.
*/
import java.awt.Color;

public class E4 {
  public static void main(String[] args) {
    int w = Integer.parseInt(args[0]);
    int h = Integer.parseInt(args[1]);
    Picture p = new Picture(w, h);
    for (int x = 0; x < w; x++) {
          for (int y = 0; y < h; y++) {
            Color pixelColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

            p.set(x, y, pixelColor);
    
    // Do not remove these function calls
    p.show();
    p.save("E4.png");
    }
  } 
}
}
