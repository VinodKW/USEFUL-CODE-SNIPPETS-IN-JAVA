
import java.io.*;

class Printwriter
{
     public static void main(String[] args) throws IOException
     {
         PrintWriter pw = new PrintWriter(new File("G:\\newfile1.txt"));
         pw.println("hello");
         pw.println("Vinod");
         pw.flush();
         pw.close();
     }

}
