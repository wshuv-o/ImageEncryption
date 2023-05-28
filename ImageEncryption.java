import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class ImageEncryption {

    public static void main(String[] args) throws Exception {
        // Generate a symmetric key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        int keyBitSize = 256;
        keyGenerator.init(keyBitSize, secureRandom);
        Key key = keyGenerator.generateKey();

        // Encrypt the image
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        FileInputStream inputStream = new FileInputStream("input.jpg");
        byte[] inputBytes = new byte[(int) inputStream.getChannel().size()];
        inputStream.read(inputBytes);
        byte[] outputBytes = cipher.doFinal(inputBytes);
        FileOutputStream outputStream = new FileOutputStream("image.enc");
        outputStream.write(outputBytes);
        inputStream.close();
        outputStream.close();

        // Decrypt the image
        cipher.init(Cipher.DECRYPT_MODE, key);
        FileInputStream encryptedInputStream = new FileInputStream("image.enc");
        byte[] encryptedInputBytes = new byte[(int) encryptedInputStream.getChannel().size()];
        encryptedInputStream.read(encryptedInputBytes);
        byte[] decryptedOutputBytes = cipher.doFinal(encryptedInputBytes);
        FileOutputStream decryptedOutputStream = new FileOutputStream("image.dec");
        decryptedOutputStream.write(decryptedOutputBytes);
        encryptedInputStream.close();
        decryptedOutputStream.close();
    }
}