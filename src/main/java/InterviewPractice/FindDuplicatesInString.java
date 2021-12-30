package InterviewPractice;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        findDuplicates();
        //findDuplicatesByStringOnly();
        //findDuplicatesAgain("Testeverythingelseyouwillmissabug");

    }



    public static void findDuplicates() {
        String s = "tes";
        char[] ch = s.toCharArray();
        int lengthOfString = s.length() - 1;


        if (ch.length > 1) {
            ArrayList<Character> t = new ArrayList<Character>();
            for (int i = 0; i <= lengthOfString; i++) {
                if (!t.contains(ch[i])) {
                    t.add(ch[i]);
                }
            }
            System.out.println(String.valueOf(t));
        }
    }


    public static void findDuplicatesByStringOnly() {
        String s = "testyourknowledge";
        String current="";
        String duplicates="";
        for ( int i=0; i<s.length();i++)
        {
            String t = Character.toString(s.charAt(i));
            if (current.contains(t))
            {
                if (!duplicates.contains(t))
                {
                    duplicates += t + ",";
                }
            }
                current =current+t;

            }

            System.out.println("duplicates are"+" "+duplicates);


    }

    public static void findDuplicatesAgain(String s)
    {
        char[] ch= s.toCharArray();
        ArrayList<Character> cha= new ArrayList<Character>();
        for ( int i=0; i<s.length();i++)
        {
            if (!cha.contains(ch[i]))
            {
                cha.add(ch[i]);
            }
        }
        String duplicates="";
        for( int i=0;i<cha.size();i++)
        {
            String h= cha.get(i).toString();
            duplicates+= h + ",";
        }
        System.out.println(String.valueOf(cha));
        System.out.println(duplicates);
    }
}
