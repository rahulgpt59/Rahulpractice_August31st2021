package InterviewPractice;

import java.sql.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Rahul is a good boy";

        char[] arr= s.toCharArray();
        int i=0;
        int j=s.length()-1;
                while(i<j)
                {
                    if (arr[i]=='\0' )
                    {
                        i++;
                        continue;
                    }
                    else if  (arr[j]=='\0' )
                {
                    j--;
                    continue;
                }
                    else
                    {
                        char temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        i++;
                        j--;
                        continue;
                    }
                }
        System.out.println(String.valueOf(arr));

    }

}
