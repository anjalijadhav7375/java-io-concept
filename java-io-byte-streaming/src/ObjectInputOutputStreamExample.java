import java.io.*;

class Student implements Serializable{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Integer id = 100;
        String msg = "Hello from Input/Output stream";
        Student student = new Student("Anjali",101);

        OutputStream fileOutputStream = new FileOutputStream("C://Users//Dell//IdeaProjects//java-io-concept//java-io-byte-streaming//src//object.txt");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(id);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        InputStream fileInputStream = new FileInputStream("C://Users//Dell//IdeaProjects//java-io-concept//java-io-byte-streaming//src//object.txt");
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);

        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
    }
}
