import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("text.txt");
        BufferedReader br=new BufferedReader(fr);
        StringBuilder sb=new StringBuilder();
        String line;
        while((line=br.readLine())!=null)
        {
            sb.append(line).append('\n');
        }
        String content=sb.toString();
        System.out.printf("%s\n",content);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader brr=new BufferedReader(isr);
        int number=Integer.parseInt(brr.readLine());
        switch(number)
        {
            case 0:
                String upper=content.toUpperCase();
                System.out.printf("%s",upper);
                break;
            case 1:
                String clear=content.replaceAll("[,.?!]","");
                System.out.printf("%s",clear);
                break;
            case 2:
                String nospace=content.replaceAll(" {2,}"," ");
                System.out.printf("%s",nospace);
                break;
        }
    }
}