// import java.util.*;
// import java.io.*;

// class SortAndDuplicate {
//     private int[] arr;
//     private int size;

//     public SortAndDuplicate(int capacity) {
//         arr = new int[capacity];
//         size = 0;
//     }

//     public void readFromFile(String filename) throws IOException {
//         Scanner in = new Scanner(new File(filename));
//         while (in.hasNextInt()) {
//             arr[size++] = in.nextInt();
//         }
//         in.close();
//     }

//     public void writeToFile(String filename) throws IOException {
//         PrintWriter out = new PrintWriter(new FileWriter(filename));
//         for (int i = 0; i < size; i++) {
//             out.print(arr[i] + " ");
//         }
//         out.close();
//     }

//     public void sort() {
//         Arrays.sort(arr, 0, size);
//     }

//     public int findNextGreater(int num) {
//         int lo = 0, hi = size - 1, ans = -1;
//         while (lo <= hi) {
//             int mid = lo + (hi - lo) / 2;
//             if (arr[mid] > num) {
//                 ans = arr[mid];
//                 hi = mid - 1;
//             } else {
//                 lo = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public void findDuplicates() {
//         HashSet<Integer> set = new HashSet<Integer>();
//         for (int i = 0; i < size; i++) {
//             if (!set.add(arr[i])) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = in.nextInt();
//         System.out.print("Enter lower bound: ");
//         int lb = in.nextInt();
//         System.out.print("Enter upper bound: ");
//         int ub = in.nextInt();

//         Random rand = new Random();
//         try {
//             PrintWriter out = new PrintWriter(new FileWriter("input.txt"));
//             for (int i = 0; i < n; i++) {
//                 int num = rand.nextInt(ub - lb + 1) + lb;
//                 out.print(num + " ");
//             }
//             out.close();
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         SortAndDuplicate obj = new SortAndDuplicate(n);
//         try {
//             obj.readFromFile("input.txt");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         obj.sort();

//         System.out.print("Enter a number: ");
//         int num = in.nextInt();
//         int ans = obj.findNextGreater(num);
//         if (ans == -1) {
//             System.out.println("Immediate greater number: -1");
//         } else {
//             System.out.println("Immediate greater number: " + ans);
//         }

//         // find duplicates
//         System.out.print("Duplicate elements: ");
//         obj.findDuplicates();
//         System.out.println();

//         // write sorted array to file
//         try {
//             obj.writeToFile("output.txt");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the lower bound (lb): ");
        int lb = scanner.nextInt();
        System.out.print("Enter the upper bound (ub): ");
        int ub = scanner.nextInt();

        generateRandomNumbers(n, lb, ub, "input.txt");

        IntArray arr = new IntArray("input.txt");

        System.out.print("Enter the number to search for: ");
        int num = scanner.nextInt();
        System.out.println("Immediate greater number: " + arr.findImmediateGreater(num));

        System.out.print("Duplicate elements: ");
        arr.printDuplicateElements();

        arr.sort();
        arr.saveToFile("output.txt");
    }

    private static void generateRandomNumbers(int n, int lb, int ub, String fileName) {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < n; i++) {
                int randomNumber = lb + random.nextInt(ub - lb + 1);
                writer.write(String.valueOf(randomNumber));
                if (i < n - 1) {
                    writer.write(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class IntArray {
    private int[] array;
    private int size;

    public IntArray(String fileName) {
        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        size = list.size();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = list.get(i);
        }
    }

    public int findImmediateGreater(int num) {
        int minGreater = -1;
        for (int value : array) {
            if (value > num) {
                if (minGreater == -1 || value < minGreater) {
                    minGreater = value;
                }
            }
        }
        return minGreater;
    }

    public void printDuplicateElements() {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < size; i++) {
                writer.write(String.valueOf(array[i]));
                if (i < size - 1) {
                    writer.write(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
