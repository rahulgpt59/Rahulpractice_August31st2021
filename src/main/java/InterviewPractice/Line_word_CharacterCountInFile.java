package InterviewPractice;

import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;

public class Line_word_CharacterCountInFile {
    int charCount=0;
    int wordCount=0;
    int lineCount=0;
    int specificWordCount=0;



@Test

    public  void Line_word_CharacterCountInFile() throws IOException ,FileNotFoundException{
        try
        { BufferedReader br= new BufferedReader(new FileReader("src/main/resources/InputCharacterReadfromFile.txt"));

        String curLine=br.readLine();

        while( curLine!=null) {
            lineCount++;

            //words count
            String[] words = curLine.split(" ");


            wordCount = wordCount + words.length;
            //System.out.println("Word count in line"+lineCount+"is"+wordCount);
            for (String word : words) {
                if (word.contains("Rahul"))
                {
                    specificWordCount++;
                }
                charCount = charCount + word.length();
            }
            curLine = br.readLine();
        }


        }
        catch(FileNotFoundException f)
        {
            f.printStackTrace();
        }
        catch(IOException ic)
        {
            ic.printStackTrace();
        }

        System.out.println("Total Lines in a given file is "+lineCount);
        System.out.println("Total words in a given file is "+wordCount);
        System.out.println("Total characters in a given file is "+charCount);
    System.out.println("Total specific word cunt in a given file is "+specificWordCount);

    }
}
