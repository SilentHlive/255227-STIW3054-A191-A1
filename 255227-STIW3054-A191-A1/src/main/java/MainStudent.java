import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) throws IOException {
       StudentSTIW3054 student = new StudentSTIW3054();
       //ArrayList<String> list = new ArrayList<String>();*/
        ArrayList<String> list = new ArrayList<>();

        Scanner scan = new Scanner(new File("student.xls"));

        while(scan.hasNext())
        {
            list.add(scan.nextLine());
            list.add(" \n");
        }
        System.out.println(list);
    }
}
