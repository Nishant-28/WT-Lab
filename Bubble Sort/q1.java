import java.util.Scanner;
import java.util.Random;

class QuickSort
{
    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int start, int end)
    {
        int i,j;
        int pivot = arr[start];
        i = start;
        j = end+1;
        while(i<j)
        {
            do{
                if(i==end)
                    break;
                ++i;
            }while(arr[i]<=pivot);

            do{
                --j;
            }while(arr[j]>pivot);

            if(i<j)
            {
                swap(arr, i, j);
            }

        }
        swap(arr, start, j);
        return j;
    }
    static void qSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int pIndex = partition(arr, start, end);
            qSort(arr, start, pIndex - 1);
            qSort(arr, pIndex + 1, end);
        }
    }
}

public class q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        QuickSort.qSort(arr, 0, n - 1);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}