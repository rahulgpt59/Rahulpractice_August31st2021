package InterviewPractice;

import org.testng.annotations.Test;

public class ReverseStringUsingCharAt {

    public static void main(String[] args) {
        reverseString();
        reverseString1();

    }

    public static void reverseString()
    {
        String s= "my name is rahul";
        String k="";

        int j;
        for (  j=s.length()-1;j>=0;j--)
        {
            k=k+s.charAt(j);

        }
        System.out.println(k);


    }

    public static void reverseString1()
    {
        String s= "my name is rahul";
        char[] ch=s.toCharArray();
        String reverse="";

        int j;
        for (  j=s.length()-1;j>=0;j--)
        {
            char temp=ch[j];
            reverse=reverse+temp;


        }
        System.out.println(reverse);


    }

}