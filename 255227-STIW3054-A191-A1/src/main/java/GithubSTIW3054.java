import java.io.*;
import java.util.*;

public class GithubSTIW3054 {
    int count = 0;
    String matricno, link;
    ArrayList<GithubSTIW3054> list = new ArrayList<>( );

    GithubSTIW3054(String matricno, String link) throws IOException {
        this.matricno = matricno;
        this.link = link;
    }

    GithubSTIW3054(int count, String matricno, String link) throws IOException {
        this.count = count;
        this.matricno = matricno;
        this.link = link;
    }

    GithubSTIW3054() throws IOException {}

    public String getLink() {
        return link;
    }

    public void setLink(String newLink) {
        this.link = newLink;
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

    public void createAcc(String matricno, String link) throws IOException {
        GithubSTIW3054 s = new GithubSTIW3054(matricno, link);
        list.add(s);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("account.xls")));
        for (int x = 0; x < list.size( ); x++) {
            out.println(list.get(x).getMatricNo( ) + " " + list.get(x).getLink( ));
        }
        out.close( );
    }


    public void StudentAcc() {
        for (GithubSTIW3054 std : list) {
            System.out.println(std.getMatricNo( ) + " " + std.getLink( ));
        }
    }


}

