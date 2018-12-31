/* program to display total directories and files present in the given directory */
import java.io.*;

class Directoriesandfileslist
{
    public static void main(String[] args) throws IOException
    {
        int count = 0;
        File f = new File("G:\\");
        String[] s = f.list();
        for(String s1 : s)
        {
            File f1 = new File(f,s1);
            if(f1.isDirectory() || f1.isFile())
            { 
                System.out.println(s1);
                count++;

            }
            
        }
        System.out.println("TOTAL:: "+count);
    }
}
