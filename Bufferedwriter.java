import java.io.*;

class Bufferedwriter
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("G:\\bufferedfile.txt")));
        bw.write("vinod");
        bw.newLine();
        char[] ch = {'a','b','c'};
        bw.write(ch);
        bw.newLine();//new function w.r.t FileWriter.
        bw.flush();
        bw.close();

    }
}
