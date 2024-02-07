import Jackson;

public class WriteToFile {
    Student student;
    public final String FILE_JSON = "students.json";
    public final String FILE_XML = "students.xml";
    public final String FILE_BIT = "students.bit";

    public WriteToFile(Student student) {
        this.student = student;
    }

    public void write(String fileName) {
        if(fileName.endsWith(".json")) {
            ObjectMapper m = new ObjectMapper();
        }
    }
}
