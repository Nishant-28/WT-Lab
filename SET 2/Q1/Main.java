import java.io.*;
import java.util.*;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the lower bound: ");
        int lb = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int ub = sc.nextInt();

        File file = new File("file1.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int randomNumber = rand.nextInt(ub - lb + 1) + lb;
            writer.write(Integer.toString(randomNumber));
            writer.newLine();
        }
        writer.close();

        CustomArray customArray = new CustomArray(n);
        customArray.readFromFile(file);
        customArray.sortAndUpdate();
        System.out.println("Updated Array: " + Arrays.toString(customArray.array));
        customArray.findDuplicates();
        customArray.writeToFile("file2.txt");
        sc.close();
    }
}

class CustomArray {
    int[] array;
    int size;

    public CustomArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void readFromFile(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        int index = 0;
        while (sc.hasNextInt()) {
            array[index++] = sc.nextInt();
        }
        sc.close();
    }

    public void sortAndUpdate() {
        Arrays.sort(array);
        int[] temp = new int[size];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                temp[j++] = array[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                temp[j++] = array[i];
            }
        }

        array = temp;
    }

    public void findDuplicates() {
        System.out.print("Duplicate elements: ");
        for (int i = 1; i < size; i++) {
            if (array[i] == array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public void writeToFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < size; i++) {
            writer.write(Integer.toString(array[i]));
            writer.newLine();
        }
        writer.close();
    }
}