/* Program to illustrate the use of Treemap
*/


import java.util.*;

class Treemap
{
    public static void main(String[] args)
    {
        TreeMap t = new TreeMap(new Mycomparator());
        t.put(101,"Vinod");
         
        t.put(102,"Kumar");
        
        t.put(103,"Wagh");
        System.out.println(t);
    }
    
}
class Mycomparator implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
       Integer i1 = (Integer)obj1;
       Integer i2 = (Integer)obj2;
        return -i2.compareTo(i1);
    }
}
