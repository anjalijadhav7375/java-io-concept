import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String s = "Hello from String";

        StringReader stringReader = new StringReader(s);
        char[] charsFromString = new char[20];

        stringReader.read(charsFromString);

        System.out.println(charsFromString);

        StringWriter stringWriter = new StringWriter();

        String writeenString = " ";

        stringWriter.write(writeenString);

        System.out.println("String Written " + writeenString);
    }
}
