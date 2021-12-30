package InterviewPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionPractice_FindOccurenceInArray {
    public static void main(String[] args) throws IndexOutOfBoundsException {

int[] arrayInt={5,8,9,8,9,7,8,8,8,9,9,5,4,7};
            CollectionPractice_FindOccurenceInArray.findOccurrence(arrayInt);
        }
    public static void findOccurrence(int[] arr)
        {
            int length=arr.length;
            int finalPosition=length -1;
            ArrayList<Integer> arList= new ArrayList<Integer>();

            if(arr.length>1)
            {

                for ( int i=0;i< arr.length;i++)
                {
                    int occurrence=0;
                    if(! arList.contains(arr[i]))
                    {
                        arList.add(arr[i]);
                        occurrence=occurrence +1;
                        if(arr[i]!=finalPosition)
                        {
                            for (int j=i+1;j<length;j++)
                            {
                                if (arr[i]==arr[j])
                                {
                                    occurrence=occurrence +1;
                                }
                            }
                        }
                        System.out.println("Occurence of "+arr[i]+" is "+occurrence);
                    }
                }
            }
            else
            {
                System.out.println("Occurrence of "+arr[0]+" is 1");
            }


        }
        }


        //Todo write code logic with Rahul's method
    //int j=arr.length-2;
    /*int m = arr.length;
    int i = 0;
    for (i = 0; i < m; i++) ;

    {
        int count = 0;

            *//*if (i > 0) {
                int l = i - 1;
                while (l >= 0) {
                    if (arr[i] == arr[l]) {

                        break;
                    } else if (l > 0) {
                        l--;
                    }
                }
                count++;
            }*//*
        count++;


        if (i < m - 1) {
            for (int k = i + 1; k < m; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }


        }
        System.out.println(count);
    }
}
        catch(Exception e)
    {
        e.printStackTrace();
    }
    }*/

