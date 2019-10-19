import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.*;
import java.util.*;

public class StudentSTIW3054 {
    int count=0;
    String name,matricno;
    ArrayList<StudentSTIW3054> list = new ArrayList<StudentSTIW3054>();
    StudentSTIW3054(String matricno,String name) throws IOException {
        this.matricno = matricno;
        this.name =name;
    }

    StudentSTIW3054() throws IOException {}

    public String getName() { return name; }
    public void setName(String newName) { this.name = newName; }

    public String getMatricNo() { return matricno; }
    public void setMatricno(String matricno) { this.matricno = matricno; }

    public int getCount() { count+=1;return count; }

    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("Sample sheet");

    public void createAccount(String matricno, String name) throws IOException {
        StudentSTIW3054 s = new StudentSTIW3054(matricno, name);
        list.add(s);
    }

    public void StudentList(){
    for (StudentSTIW3054 std : list) {
        System.out.println(std.getMatricNo( ) + " " + std.getName( ));
    }
    }

}
