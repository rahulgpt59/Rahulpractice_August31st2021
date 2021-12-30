package InterviewPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuferReader_Practice {
    public static void main(String[] args) throws IOException {
        readAnyFile();
    }

    public static void readAnyFile() throws IOException {
        try {
            int noOfLines = 0;
            int noOfWords = 0;
            int noOfSpecificWords = 0;
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/InputCharacterReadfromFile.txt"));
            String nextLine = br.readLine();
            while (nextLine != null) {
                noOfLines = noOfLines+1;
                String[] line = nextLine.split(" ");
                noOfWords = noOfWords + line.length;

                for (String word:line
                     ) {
                    if(word.equals("Rahul"))
                    {
                        noOfSpecificWords=noOfSpecificWords+1;
                    }

                }
                nextLine=br.readLine();
            }
            System.out.println("total number of lines in file are"+ noOfLines);
            System.out.println("total number of words in file are"+ noOfWords);
            System.out.println("total number of specific words in file are"+ noOfSpecificWords);

        }
        catch(IOException i)
        {
            i.printStackTrace();
        }

    }
}


