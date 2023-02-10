import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C://Users//Dell//IdeaProjects//java-io-concept//java-io-byte-streaming//src//input.txt");
        inputStream.available();

        OutputStream outputStream = new FileOutputStream("C://Users//Dell//IdeaProjects//java-io-concept//java-io-byte-streaming//src//output.txt");

        byte[] bytes = inputStream.readAllBytes();
        outputStream.write(bytes);

        inputStream.close();
        outputStream.close();
    }

}