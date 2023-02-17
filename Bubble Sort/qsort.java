import java.util.Scanner;
import java.util.Random;

class QuickSort
{
    static int partition(int[] arr, int start, int end)
    {
        int i,j;
        int pivot = arr[start];
        i = start;
        j = end + 1;
        while(i<j)
        {
            do
            {
                if(i==end)
                    break;
                ++i;
            }while(arr[i]<=pivot);
            
            do
            {
                --j;
            }while(arr[j]>pivot);
            
            if(i<j)
            {
                swapped(arr, i, j);
            }
        }
        swapped(arr, start, j);
        return j;
    }
    
    static void swapped(int array[], int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void quickSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }
}


public class qsort
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Size of array : ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Unsorted Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        QuickSort.quickSort(arr, 0, n-1);
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}