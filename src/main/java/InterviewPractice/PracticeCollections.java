package InterviewPractice;

import java.util.*;
import java.util.logging.Handler;


public class PracticeCollections {
    public static void main(String[] args) {

        ArrayList<Integer> i=new ArrayList<Integer>();
        HashSet<Integer> a=new HashSet<Integer>();

        HashMap<Integer,String>b=new HashMap<Integer,String>();
        b.put(1,"rahul");
        b.put(2,"Prashni");
        b.put(3,"Akshat");
        b.put(4,"rahul");
        a.add(5);
        i.add(7);
        System.out.println("array List is "+i.get(0));
        System.out.println("HashSet is "+a);
        System.out.println("HashMap is "+b.get("Prashni"));
        Set sn=b.entrySet();
        Iterator itt= sn.iterator()  ;

while (itt.hasNext())
{
Map.Entry mp=(Map.Entry)itt.next();
System.out.println(mp.getKey());
    System.out.println(mp.getValue());
    System.out.println("Hash map record is"+mp);
}
/*Hash Table Practice*/
       Hashtable<Integer,String>ht=new Hashtable<>();
        ht.put(1,"rahul");
        ht.put(2,"Prashni");
        ht.put(3,"Akshat");
        ht.put(4,"Harsh");
        System.out.println("Hash Table "+ht.get(2));

        Enumeration enu= ht.elements();
        System.out.println("Hash table value for index 3 is "+ ht.get(3));

        while (enu.hasMoreElements())
        {

            System.out.println("Hash table value is "+ enu.nextElement());


        }


    }
}
