import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class RandomArray {
    private int[] arr;
    private int size;

    RandomArray(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void readFile() {
        try {
            File file = new File("random_numbers.txt");
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNextInt() && i < size) {
                arr[i++] = scanner.nextInt();
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try {
            File file = new File("updated_numbers.txt");
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < size; i++) {
                writer.write(arr[i] + " ");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file");
            e.printStackTrace();
        }
    }

    public void sortAndReplace() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int[] dupArr = new int[size];
        int dupCount = 0;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                dupArr[dupCount++] = arr[i];
                arr[i] = 0;
                arr[i + 1] = 0;
            }
        }

        System.out.println("Duplicate Elements:");
        for (int i = 0; i < dupCount; i++) {
            System.out.print(dupArr[i] + " ");
        }
        System.out.println();

        double sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                sum += arr[i];
                count++;
            }
        }

        System.out.println("Average: " + sum / count);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        RandomArray randArr = new RandomArray(n);
        randArr.readFile();
        randArr.sortAndReplace();
        randArr.writeFile();
        sc.close();
    }
}