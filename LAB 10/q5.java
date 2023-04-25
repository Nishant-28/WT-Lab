// Write a java program to capitalize first letter of every word from file1.txt to file2.txt 

import java.io.*;
import java.util.*;

public class q5 {
    public static void main(String[] args) throws IOException {
        String filename = "file1.txt";
        File file = new File(filename);
        Scanner sc1 = new Scanner(file);
        FileWriter fw = new FileWriter("file2.txt");
        while (sc1.hasNextLine()) { 
            String line = sc1.nextLine(); //
            String[] words = line.split(" "); // split the line into words
            for (String word : words) { // for each word in the line
                String firstLetter = word.substring(0, 1); 
                String remainingLetters = word.substring(1); // 
                fw.write(firstLetter.toUpperCase() + remainingLetters + " ");
            }
            fw.write(" ");
        }
        
        fw.close();
        sc1.close();
        sc1.close();
    }
}
