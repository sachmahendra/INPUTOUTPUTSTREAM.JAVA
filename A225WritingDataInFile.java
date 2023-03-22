import java.io.*;

class Student{
    int rollno;
    String name;
    String dept;

}
public class A225WritingDataInFile {  //ALSO KNOWN AS DATA OUTPUT FROM A FILE
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Text4.txt");

        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "jhon";
        s.dept = "cse";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
    }
}
