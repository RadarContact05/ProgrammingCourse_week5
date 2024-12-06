/*

This class is a library of useful methods related to
colors and their luminance.

*/
import java.awt.Color;
public class Luminance{
  /*
  The monochromatic luminance.
  Returns a double between 0 and 255.
  */
  public static double lum(Color c){
    int r = c.getRed();
    int g = c.getGreen();
    int b = c.getBlue();
    return .299*r + .587*g + .114*b;
  }

  /*
  Returns a Color that is a variant of gray with
  all components equal to the closest integer to the
  luminance of the argument.
  */
  public static Color toGray(Color c){
    int y = (int) Math.round(lum(c));
    Color gray = new Color(y, y, y);
    return gray;
  }

  /*
  Returns a boolean value for whether the argument colors are
  suitable to be used as background color and text color.
  */
  public static boolean compatible(Color a, Color b){
    return Math.abs(lum(a) - lum(b)) > 128.0;
  }


  public static void main(String[] args){
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);
    Color c = new Color(r, g, b);
    System.out.println(Math.round(lum(c)));
  }

}
