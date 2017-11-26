import  edu.princeton.cs.introcs.Picture;
import  edu.princeton.cs.introcs.Luminance;
import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;


public class Histogram_grayScale {




    public static void main(String[] args) {
        // Show image in grayscale.
        Picture picture = new Picture(args[0]); // use the Picture library to open the file and access individual pixels
        int[] grayscaleCounts = new int[256];
        double x = 0;
        int y =0;

        for (int col = 0; col < picture.width(); col++)
        {
            for (int row = 0; row < picture.height(); row++)
            {
                Color color = picture.get(col, row); // count each pixel of the image
                Color gray = Luminance.toGray(color); // convert to grayscale (does nothing if already grayscale)
                grayscaleCounts[gray.getBlue()] ++; // count the occurrence of the found value (in grayscale, R=G=B=Y, where Y is the monochrome luminance)

            }
        }


 //        use grayscaleCounts to create a histogram using StdDraw
        StdDraw.setCanvasSize(1000,500);
        for(int i = 0; i < 256 ; i++) {
            double q = (grayscaleCounts[i])/10000.0;
            System.out.println(grayscaleCounts[i]);
            StdDraw.setPenColor(y, y, y);
            StdDraw.filledRectangle(x, .1, .004, q);
           x = x +.008;
           y++;

//        StdDraw.filledRectangle(.5,.1,.004,.5);
        }
    }

    }

