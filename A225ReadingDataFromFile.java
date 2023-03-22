import java.io.*;

class Student{
    int rollno;
    String name;
    String dept;

}
public class A225ReadingDataFromFile {  //ALSO KNOWN AS DATA OUTPUT FROM A FILE
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Text4.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

    
        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Student rollno is: "+s.rollno);
        System.out.println("Student name is: "+s.name);
        System.out.println("Student dept is: "+s.dept);
    }
}


