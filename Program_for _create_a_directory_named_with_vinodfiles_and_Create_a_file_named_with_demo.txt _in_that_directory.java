/* code to create a directory named with vinodfiles in current working directory and create a file named with 
demo.txt in that directory */
import java.io.*;

class Directoryandfile
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("G:\\vinodfiles1");
        f.mkdir();
        File f1 = new File(f,"demo.txt");
       // (or) File f1 = new File("G:\\vinodfiles1","demo.txt");
        f1.createNewFile();
    }
}
