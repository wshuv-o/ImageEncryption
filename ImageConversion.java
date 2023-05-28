import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageConversion {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("image.dec");
        byte[] inputBytes = new byte[(int) inputStream.getChannel().size()];
        inputStream.read(inputBytes);
        FileOutputStream outputStream = new FileOutputStream("image.jpg");
        outputStream.write(inputBytes);
        inputStream.close();
        outputStream.close();
    }
}
