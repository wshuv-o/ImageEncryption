import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encrypt {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("numbers.csv"));
    String original = reader.readLine();
    reader.close();

    original = original.replace(",1",">");
    original = original.replace(",2","Q");
    original = original.replace(",3","_");
    original = original.replace(",4","^");
    original = original.replace(",5","w");
    original = original.replace(",6","\\");
    original = original.replace(",7","[");
    original = original.replace(",8","@");
    original = original.replace(",9","?");
    original = original.replace("69","=");
    original = original.replace("68","<");
    original = original.replace("67",";");
    original = original.replace("66",":");
    original = original.replace("65","~");
    original = original.replace("64","`");
    original = original.replace("63","|");
    original = original.replace("62","{");
    original = original.replace("61","Z");
    original = original.replace("60","Y");
    original = original.replace("59","X");
    original = original.replace("58","W");
    original = original.replace("57","V");
    original = original.replace("56","U");
    original = original.replace("55","T");
    original = original.replace("54","S");
    original = original.replace("53","R");
    original = original.replace("52","}");
    original = original.replace("51","P");
    original = original.replace("50","O");
    original = original.replace("49","N");
    original = original.replace("48","M");
    original = original.replace("47","L");
    original = original.replace("46","K");
    original = original.replace("45","I");
    original = original.replace("44","J");
    original = original.replace("43","H");
    original = original.replace("42","G");
    original = original.replace("41","F");
    original = original.replace("40","E");
    original = original.replace("39","D");
    original = original.replace("38","C");
    original = original.replace("37","B");
    original = original.replace("36","A");
    original = original.replace("35","z");
    original = original.replace("34","y");
    original = original.replace("33","x");
    original = original.replace("32","]");
    original = original.replace("31","v");
    original = original.replace("30","u");
    original = original.replace("29","t");
    original = original.replace("28","s");
    original = original.replace("27","r");
    original = original.replace("26","q");
    original = original.replace("25","p");
    original = original.replace("24","o");
    original = original.replace("23","n");
    original = original.replace("22","m");
    original = original.replace("21","i");
    original = original.replace("20","l");
    original = original.replace("19","k");
    original = original.replace("18","j");
    original = original.replace("17","h");
    original = original.replace("16","g");
    original = original.replace("15","f");
    original = original.replace("14","e");
    original = original.replace("13","d");
    original = original.replace("12","c");
    original = original.replace("11","b");
    original = original.replace("10","a");
            
    

    BufferedWriter writer = new BufferedWriter(new FileWriter("numbers.csv"));
    writer.write(original);
    writer.close();
  }
}
