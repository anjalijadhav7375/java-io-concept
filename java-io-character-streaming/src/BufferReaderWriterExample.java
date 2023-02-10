import java.io.*;

public class BufferReaderWriterExample {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("C://Users//Dell//IdeaProjects//java-io-concept//java-io-charactor-streaming//src//input.txt1");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        char[] charsFromInputFile = new char[50];
        bufferedReader.read(charsFromInputFile);
        System.out.println(charsFromInputFile);

        Writer fileWriter = new FileWriter("C://Users//Dell//IdeaProjects//java-io-concept//java-io-charactor-streaming//src//output.txt1");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(charsFromInputFile);
    }
}
