/* 
FileReader
------------

we can use FileReader to read charachter data from file

Constructors
================================================================================================================
FileReader fr = new FileReader(String filename);
FileReader fr = new FileReader(File f);
================================================================================================================
*/
import java.io.*;

class FileReaderImplementation
{
    public static void main(String[] args) throws IOException
    { 
        // first approach
        //---------------------------------------------------------------------------------------------
        
        FileReader fr = new FileReader("G:\\samplefile.txt");
        // (or) FileReader fr = new FileReader(new File("G:\\samplefile.txt"));
        
       
        char[] ch = new char[(int)(new File("G:\\samplefile.txt")).length()];
        fr.read(ch);
        for(char ch1 : ch)
        {
            System.out.println(ch1);

        }
        //---------------------------------------------------------------------------------------------------
        //==================================================================================================
        
        // second approach
        //------------------------------------------------------------------------------------------------------
        FileReader fr1 = new FileReader("G:\\samplefile.txt");
        // (or) FileReader fr = new FileReader(new File("G:\\samplefile.txt"));
        int i = fr1.read();
        while(i!=-1)
        {
            System.out.println((char)i);
            i = fr1.read();
        }
        //--------------------------------------------------------------------------------------------------------


    }
}
