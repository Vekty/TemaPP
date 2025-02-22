import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("text.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        System.out.printf("%s",line);
    }
}