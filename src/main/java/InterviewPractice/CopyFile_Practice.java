package InterviewPractice;

import java.io.*;

public class CopyFile_Practice {
    public static void main(String[] args) throws IOException {
        CopyFile_Practice cp = new CopyFile_Practice();

        cp.copyFile();

    }


    public void copyFile() throws IOException {
        File f = new File("src/main/resources/InputCharacterReadfromFile.txt");
        File f1 = new File("src/main/resources/InputCharacterReadfromFile2.txt");
        FileInputStream file1 = null;
        FileOutputStream file2 = null;
        try {
            file1 = new FileInputStream(f);
            System.out.println(file1.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            file2 = new FileOutputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int i = 0;
        try {
            while ((i = file1.read()) != -1) {
                file2.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (file1 != null) {
                try {
                    file1.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            if (file2 != null) {
                try {
                    file2.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
