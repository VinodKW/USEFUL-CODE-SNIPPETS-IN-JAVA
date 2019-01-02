import java.io.*;
class Bufferedreader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(new File("G:\\samplefile.txt")));
        String s = br.readLine();//new function as compared to FileReader.
        while(s!=null)
        {
            System.out.println(s);
            s = br.readLine();
        }
        br.close();

    }
}
