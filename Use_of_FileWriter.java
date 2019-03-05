 /* use of FileWriter

We can use FileWriter to write Charachter data in the file
-> Constructors
================================================================================================================
1) FileWriter f = new FileWriter(String filename);
2) FileWriter f = new FileWriter(File f);

these above filewriters are meant for overriding of the existing data. Instead of overriding if we want the append
operation then we have to create a file writer by using the following constructors.

3) FileWriter f = new FileWriter(String filename, boolean append);
4) FileWriter f = new FileWriter(File f, boolean append);
=================================================================================================================
*/
import java.io.*;
class FileWriterimplementation
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f = new FileWriter("G:\\file4.txt");
       // (or) for appending::  FileWriter f = new FileWriter(new File("G:\\file4.txt"),true);

        f.write(86);//adding single charachter
        f.write("inod\nkumar");
        char[] ch = {'a','b','c'};
        f.write(ch);
        f.write("\n");
        f.flush();
        f.close();
    }
}


