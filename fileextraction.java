/*
This program performs deletion of lines from file1.txt which are identical and are available in delete.txt.
and creates a file named output.txt in which all lines of file1 are stored excepts those which are identical in 
delete.txt
*/

import java.io.*;

class Extraction
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(new File("G:\\file1.txt")));
        PrintWriter pw = new PrintWriter("G:\\output.txt");
        String s = br.readLine();
        while(s!=null)
        {
            int flag = 0;
            BufferedReader br1 = new BufferedReader(new FileReader(new File("G:\\delete.txt")));
            String line = br1.readLine();
            while(line!=null)
            {
                if(s.equals(line))
                {
                   flag = 1;
                   break;
                }
                else
                {
                    line = br1.readLine();
                }
            }
            if(flag == 0)
            {
                pw.println(s);
            }

            s = br.readLine();
            
        }
        pw.flush(); 
        br.close();
        pw.close();
        
    }
   

    
}
