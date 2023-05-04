package kg.megalab;

import lombok.var;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App
{
    public static void main( String[] args ) throws IOException {
        RestService restService =new RestService();
        FileWriter fw=new FileWriter("megalab.txt");
        String response = restService.run("https://cat-fact.herokuapp.com/facts");
        System.out.println(response);
        String sb = response;
        for (int i = 0; i < sb.length(); i++) {
            fw.write(sb.charAt(i));
        }
        System.out.println("Writing successful");
        fw.close();
    }
}
