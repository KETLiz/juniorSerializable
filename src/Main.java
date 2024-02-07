import java.io.*;

public class Main {
//    Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
//    Обеспечьте поддержку сериализации для этого класса.
//    Создайте объект класса Student и инициализируйте его данными.
//    Сериализуйте этот объект в файл.
//    Десериализуйте объект обратно в программу из файла.
//    Выведите все поля объекта, включая GPA, и ответьте на вопрос,
//    почему значение GPA не было сохранено/восстановлено.

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Semen", 20, 4.5);

        System.out.println("До сериализации:");
        System.out.println(student);
        System.out.println();

        WriteToFile w = new WriteToFile(student);

        try(FileOutputStream file = new FileOutputStream("students.bit");
            ObjectOutputStream obj = new ObjectOutputStream(file)) {
            obj.writeObject(student);
            System.out.println("Студент добавлен");

        }

        try(FileInputStream file = new FileInputStream("students.bit");
            ObjectInputStream obj = new ObjectInputStream(file)) {
            student = (Student) obj.readObject();
            System.out.println("После сериализации:");
            System.out.println(student);
        }
    }
}