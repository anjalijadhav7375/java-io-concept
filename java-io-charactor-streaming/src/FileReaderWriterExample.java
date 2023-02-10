import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("C://Users//Dell//IdeaProjects//java-io-concept//java-io-charactor-streaming//src//input.txt1");
        System.out.println(fileReader.ready());

        int size = 50;
        char[] charsFromFile = new char[size];
        fileReader.read(charsFromFile);

        System.out.println(charsFromFile);//Print on console

        Writer fileWriter = new FileWriter("C://Users//Dell//IdeaProjects//java-io-concept//java-io-charactor-streaming//src//output.txt1");
        fileWriter.write(charsFromFile);

    }
}
