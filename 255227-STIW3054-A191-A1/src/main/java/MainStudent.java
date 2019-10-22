import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();
        int k=1;
        // The text file location of your choice
        String filename = "student.xls";
        String filename2 = "account.xls";
        try
        {
            String[] lines = rf.readLines(filename);
            String[] lines2 = rf.readLines(filename2);
            String str[] = new String[lines.length];
            String str2[] = new String[lines2.length];
            String str3[] = new String[lines2.length];
            //System.out.println(lines.length);
            //System.out.println(lines2.length);
            System.out.printf("| %-5s| %-8s| %-39s | %-40s |\n", "No", "Matric", "Name", "GitHub Link");
            System.out.printf("| %5s| %8s| %39s | %40s |\n", "-----", "--------", "---------------------------------------", "----------------------------------------");

            for (int i =0; i<lines.length;i++)
            {
               str[i]= lines[i].substring(0,6);
                //System.out.println(lines[i]);
                for (int j =0; j<lines2.length;j++)
                { str2[j]= lines2[j].substring(0,6);

                if(str[i].equals(str2[j])) {
                    str3[j] = lines2[j].substring(7);
                    System.out.printf("| %-5s| %-8s| %-39s | %-40s |\n", k, str[i],lines[i].substring(7),str3[j]);
                    k++;
                }
                }
            //System.out.println(k);
    }}
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to create "+filename+": "+e.getMessage());
            System.out.println("Unable to create "+filename2+": "+e.getMessage());
        }
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
