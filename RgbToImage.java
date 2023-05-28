import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RgbToImage {


    public static void main(String[] Args) throws IOException {

        int width = 1280;
        int height = 720;
        
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);


        int[] data = new int[width * height];
        int i=width * height-1;
          
            BufferedReader reader = new BufferedReader(new FileReader("numbers.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
              String[] values = line.split(",");
              for (;i>=0;--i) {
                try {
                  int nextInt = (-1)*Integer.parseInt(values[i]);
                  data[i]=nextInt;
                } catch (NumberFormatException e) {
                  // Ignore non-integer values
                }
              }
            }
        
        

        image.setRGB(0, 0, width, height, data, 0, width);
      //  image.

        try {
            ImageIO.write(image, "png", new File("image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
 
  