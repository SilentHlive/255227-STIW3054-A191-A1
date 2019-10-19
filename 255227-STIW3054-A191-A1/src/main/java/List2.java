import java.io.IOException;
import java.util.Spliterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class List2{
    public static String webPage = "https://github.com/STIW3054-A191/Main-Issues/issues/1";
    public static void main(String[] args) throws IOException {


        Element html = Jsoup.connect(webPage).get();
        Elements table = html.select("table");
        Elements tr = table.select("tr");
        Elements td = tr.select("td");
        Elements p = td.select("p");
        Elements links = td.select("a[href]");
        System.out.println(td.size());
        String[] arrOfStr = p.text().split("Matric:| Matric : | matrix :| Matric No : | Matric no: ");
        for (int j = 2; j < arrOfStr.length; j++) {
            //if(arrOfStr[j])
            System.out.println(arrOfStr[j]);
    }
        for (int j = 1; j < td.size( ); j++) {
            //System.out.println(j + " "+ td.get(j).text( ));

        }
        for (int j = 1; j < td.size( ); j++) {
           // System.out.println(j + " "+ links.get(j).text( ));
        }
    }
}