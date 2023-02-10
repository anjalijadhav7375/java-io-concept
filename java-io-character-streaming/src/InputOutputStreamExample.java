import java.io.*;

public class InputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream fileInputStream = new FileInputStream("C://Users//Dell//IdeaProjects//java-io-concept//java-io-charactor-streaming//src//input.txt1");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        char[] charsFromInputFile = new char[50];
        inputStreamReader.read(charsFromInputFile);
        System.out.println(charsFromInputFile);

        OutputStream fileOutputStream =new FileOutputStream("C://Users//Dell//IdeaProjects//java-io-concept//java-io-charactor-streaming//src//output.txt1");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        outputStreamWriter.write(charsFromInputFile);

    }
}
