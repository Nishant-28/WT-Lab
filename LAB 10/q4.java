// Write a program in Java to copy the content of a given file to another user entered file using character stream.

import java.io.*;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file name to be copied: ");
        String file1 = sc.nextLine();
        String file2 = "q4_2.txt";   // your own file name is here
        sc.close();
        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}