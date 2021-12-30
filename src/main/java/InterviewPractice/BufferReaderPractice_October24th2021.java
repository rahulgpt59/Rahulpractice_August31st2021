package InterviewPractice;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderPractice_October24th2021 {

    int totalNumberOfWords=0;
    int totalNumberOfLines=0;
    int totalNumberOfSpecialWords=0;

    public static void main(String[] args) throws IOException {

        BufferReaderPractice_October24th2021 bfr= new BufferReaderPractice_October24th2021();
        bfr.countInfile();
    }


public  void countInfile() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/main/resources/InputCharacterReadfromFile.txt"));
    String fileLines = br.readLine();
    while (fileLines != null) {

        totalNumberOfLines = totalNumberOfLines + 1;
        String[] totalWordsEachLine = fileLines.split(" ");
        totalNumberOfWords = totalNumberOfWords + totalWordsEachLine.length;
        for (int i = 0; i < totalWordsEachLine.length; i++) {
            if (totalWordsEachLine[i].contains("Rahul")) {
                totalNumberOfSpecialWords = totalNumberOfSpecialWords + 1;

            }

        }
        fileLines = br.readLine();

    }
    System.out.println("total Lines in File ="+totalNumberOfLines);
    System.out.println("total words in File ="+totalNumberOfWords);
    System.out.println("total special words in File ="+totalNumberOfSpecialWords);
}
}

