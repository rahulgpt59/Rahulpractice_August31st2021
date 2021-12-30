package InterviewPractice;

public class PracticeMultiplePrograms {
    public static void main(String[] args) {
       reverseStringUsingStringBuilder("HelloWorld");
        reverseStringUsingStringBuilder1("HelloWorld");
        reverseStringUsingCharAt("HelloWorld");
    }
    public static void reverseStringUsingStringBuilder(String s)
    {
        StringBuilder sb = new StringBuilder();
        for ( int i =s.length()-1 ;i>=0;i--)
        {
            sb.append(s.charAt(i));

        }
        System.out.println(sb.toString());
    }

    public static void reverseStringUsingStringBuilder1(String s)
    {
        System.out.println(new StringBuilder(s).reverse().toString());
    }
    public static void reverseStringUsingCharAt(String s)
    {
        String reverse="";
        String reverse1="";
        for (int i=s.length()-1;i>=0;i--)
        {
            String t=String.valueOf(s.charAt(i));
            reverse= reverse+t;
            reverse1=reverse1+s.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(reverse1);


    }

}
