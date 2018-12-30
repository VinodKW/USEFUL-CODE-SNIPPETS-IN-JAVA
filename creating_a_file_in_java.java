import java.io.*;

class File1
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("G:\\newfile.txt");      /*this statement will not create any physical file, firstly it will 
        check if the file with the given name is present in the current directory or not.
        * if it is available than*
        "f simple refers to that file"
        * if it is not available than*
        "then we are just creating java file object to represent the name newfile.txt"
        */

        System.out.println(f.exists()); // o/p : false
        f.createNewFile();
        System.out.println(f.exists());//o/p : true

    }
}
