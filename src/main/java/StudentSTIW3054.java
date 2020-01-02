
import java.io.*;
import java.util.*;

public class StudentSTIW3054 {
    int count = 0;
    String name, matricno;
    ArrayList<StudentSTIW3054> list = new ArrayList<StudentSTIW3054>( );

    StudentSTIW3054(String matricno, String name) throws IOException {
        this.matricno = matricno;
        this.name = name;
    }

    StudentSTIW3054(int count, String matricno, String name) throws IOException {
        this.count = count;
        this.matricno = matricno;
        this.name = name;
    }

    StudentSTIW3054() throws IOException {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getMatricNo() {
        return matricno;
    }

    public void setMatricno(String matricno) {
        this.matricno = matricno;
    }

    public int getCount() {
        count += 1;
        return count;
    }

    public void createAccount(String matricno, String name) throws IOException {
        StudentSTIW3054 s = new StudentSTIW3054(matricno, name);
        list.add(s);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\HALIMAH\\Documents\\255227-STIW3054-A191-A1\\student.xls")));
        for (int x = 0; x < list.size( ); x++) {
            out.println(list.get(x).getMatricNo( ) + " " + list.get(x).getName( ));
        }
        out.close( );
    }


    public void StudentList() {
        for (StudentSTIW3054 std : list) {
            System.out.println(std.getMatricNo( ) + " " + std.getName( ));
        }

    }


}

