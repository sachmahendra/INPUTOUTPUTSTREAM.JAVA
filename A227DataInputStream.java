import java.io.*;

class Student{
    int rollno;
    String name;
    float avg;
    String dept;
}

//ITS OUTPUT COME IN BINARY FORM NOT APROPERATE ANS COME 
// TO CHECK OUTPUT CLICK TERMINAL AND WRITE type Text.txt and press enter

public class A227DataInputStream {
    public static void main(String[] args) throws Exception {
    
        FileInputStream fis  = new FileInputStream("Text3.txt");

        DataInputStream dis = new DataInputStream(fis);
        Student s = new Student();

        s.rollno = dis.readInt();
        
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.avg = dis.readFloat(); //HERE IF I CHANGE THE POSITION OF THIS LINE THEN IT START SHOWING ERROR
       
        

        System.out.println("roll no: "+s.rollno);
        System.out.println("name: "+s.name);
        System.out.println("avg: "+s.avg);
        System.out.println("dept: "+s.dept);
       

        
        dis.close();
        fis.close();
    }
}

