import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class ImageToRGB {
  public static void main(String[] args) {
    // Load the input image
    BufferedImage inputImage = null;
    try {
      inputImage = ImageIO.read(new File("image.png"));
    } catch (IOException e) {
      System.err.println("Error reading input image.");
      System.exit(1);
    }

    // Convert the image to a binary number
    StringBuilder binaryNumber = new StringBuilder();
    for (int x = 0; x < inputImage.getWidth(); x++) {
      for (int y = 0; y < inputImage.getHeight(); y++) {
        int pixelValue = inputImage.getRGB(x, y);
          binaryNumber.append(binary((-1)*pixelValue, 1)+",");
      }
    }

    System.out.println();
    System.out.println(inputImage.getWidth());
    System.out.println();
    System.out.println(inputImage.getHeight());
    try {
      // Create a new PrintWriter, passing a FileWriter object as a parameter
      PrintWriter writer = new PrintWriter(new FileWriter("numbers.csv"));

      // Write the string to the file, followed by a newline character
      writer.println(binaryNumber);

      // Close the PrintWriter to save the file
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    

  }
  static int s=0, f=1;
  static int binary(int n, int f1){
    if(n!=0){
      s+=(n%2)*10*f;
      binary(n/2,f++);
    }
    return s;
  }
}
