import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("text.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        System.out.printf("%s\n",line);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader brr=new BufferedReader(isr);
        int number=Integer.parseInt(brr.readLine());
        switch(number)
        {
            case 0:
                String upper=line.toUpperCase();
                System.out.printf("%s",upper);
                break;
            case 1:
                String clear=line.replaceAll("[,.?!]","");
                System.out.printf("%s",clear);
                break;
        }
    }
}