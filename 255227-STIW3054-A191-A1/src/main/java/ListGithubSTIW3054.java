import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ListGithubSTIW3054 {
    public static String webPage = "https://github.com/STIW3054-A191/Main-Issues/issues/1";
    public static void main(String[] args) throws IOException {
        String m = "", l = "";
        GithubSTIW3054 acc = new GithubSTIW3054( );
        ArrayList<StudentSTIW3054> list = new ArrayList<StudentSTIW3054>( );
        int count = 0;

        Element html = Jsoup.connect(webPage).get();
        Elements table = html.select("table");
        Elements tr = table.select("tr");
        Elements td = tr.select("td");
        Elements p = td.select("p");
        Elements links = td.select("a[href]");
        //System.out.println(td.size());
        String[] arrOfStr = p.text().split("Matric:| Matric : | matrix :| Matric No : | Matric no: ");
        for (int j = 2; j < arrOfStr.length; j++) {
            //System.out.println(j-1 + " "+arrOfStr[j].substring(0,7).trim()+ " "+links.get(j-1).text( ));
            String mn = arrOfStr[j].substring(0,7).trim();
            m = mn;
            acc.setMatricno(m);
            l = links.get(j-1).text( );
            acc.setMatricno(l);
            acc.createAcc(m,l);
    }
        acc.StudentAcc();
    }
}