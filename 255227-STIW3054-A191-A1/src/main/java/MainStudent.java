import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    private static final String FILE_NAME = "C:\\Users\\HALIMAH\\IdeaProjects\\255227-STIW3054-A191-A1\\list_of_student.xls";
    private static ArrayList<String> list = new ArrayList<String>( );
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME)));
        ReadFile rf = new ReadFile();
        int k=1;
        int g=1;
        // The text file location of your choice
        String filename = "C:\\Users\\HALIMAH\\IdeaProjects\\255227-STIW3054-A191-A1\\student.xls";
        String filename2 = "C:\\Users\\HALIMAH\\IdeaProjects\\255227-STIW3054-A191-A1\\account.xls";
            String[] lines = rf.readLines(filename);
            String[] lines2 = rf.readLines(filename2);
            String str[] = new String[lines.length];
            String str2[] = new String[lines2.length];
            String str3[] = new String[lines2.length];
            //System.out.println(lines.length);
            //System.out.println(lines2.length);
            System.out.println("List all students who have submitted the GitHub account.");
            System.out.printf("| %-5s| %-8s| %-39s | %-40s |\n", "No", "Matric", "Name", "GitHub Link");
            out.printf("%-5s%-8s%-100s%-20s\n", "No", "Matric", "Name", "GitHub Link");
            System.out.printf("| %5s| %8s| %39s | %40s |\n", "-----", "--------", "---------------------------------------", "----------------------------------------");

            for (int i = 0; i < lines.length; i++) {
            str[i] = lines[i].substring(0, 6);
            //System.out.println(lines[i]);
            for (int j = 0; j < lines2.length; j++) {
                str2[j] = lines2[j].substring(0, 6);
                if (str[i].equals(str2[j])) {
                    str3[j] = lines2[j].substring(7);
                    System.out.printf("| %-5s| %-8s| %-39s | %-40s |\n", k, str[i],lines[i].substring(7),str3[j]);
                    out.printf("%-5s%-8s%-80s%-20s\n", k, str[i],lines[i].substring(7),str3[j]);
                    list.add(str[i]);
                    k++;
                }

            }

        }
            out.close();
            System.out.println();
            int num =lines.length;

    }

}
 class ReadFile
{
    public String[] readLines(String filename) throws IOException
    {
        FileReader fileReader = new FileReader(filename);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;

        while ((line = bufferedReader.readLine()) != null)
        {
            lines.add(line);
        }

        bufferedReader.close();

        return lines.toArray(new String[lines.size()]);
    }
}


