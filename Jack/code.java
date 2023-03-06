import java.io.*;
import java.util.*;
import java.lang.Math;

public class code
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("iris.csv"));
        String line = br.readLine();

        Iris[] iris = new Iris[150];
        int i = 0;

        while(line != null)
        {
            String[] values = line.split(",");
            iris[i] = new Iris(Double.parseDouble(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]), values[4]);
            line = br.readLine();
            i++;
        }
        br.close();

        // rewrite the code above without using BufferedReader
        // Scanner sc = new Scanner(new File("iris.csv"));
        // sc.useDelimiter(",");
        // Iris[] iris = new Iris[150];
        // int i = 0;
        // while(sc.hasNext())
        // {
        //     iris[i] = new Iris(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());
        //     i++;
        // }
        // sc.close();

        double[] A = new double[150];
        double[] B = new double[150];
        double[] C = new double[150];
        double[] D = new double[150];
        String[] name = new String[150];

        for(i = 0; i < 150; i++)
        {
            A[i] = iris[i].getA();
            B[i] = iris[i].getB();
            C[i] = iris[i].getC();
            D[i] = iris[i].getD();
            name[i] = iris[i].getname();
        }

        double[] min = new double[4];
        double[] max = new double[4];
        double[] avg = new double[4];
        double[] std = new double[4];

        for(i = 0; i < 4; i++)
        {
            min[i] = Double.MAX_VALUE;
            max[i] = Double.MIN_VALUE;
            avg[i] = 0;
            std[i] = 0;
        }

        
        for(i = 0; i < 150; i++) {
            if(A[i] < min[0])
                min[0] = A[i];
            if(B[i] < min[1])
                min[1] = B[i];
            if(C[i] < min[2])
                min[2] = C[i];
            if(D[i] < min[3])
                min[3] = D[i];
        }

        for(i = 0; i < 150; i++){
            if(A[i] > max[0])
                max[0] = A[i];
            if(B[i] > max[1])
                max[1] = B[i];
            if(C[i] > max[2])
                max[2] = C[i];
            if(D[i] > max[3])
                max[3] = D[i];
        }

        avg[0] /= 150;
        avg[1] /= 150;
        avg[2] /= 150;
        avg[3] /= 150;

        for(i = 0; i < 150; i++)
        {
            std[0] += Math.pow(A[i] - avg[0], 2);
            std[1] += Math.pow(B[i] - avg[1], 2);
            std[2] += Math.pow(C[i] - avg[2], 2);
            std[3] += Math.pow(D[i] - avg[3], 2);
        }

        std[0] = Math.sqrt(std[0] / 150);
        std[1] = Math.sqrt(std[1] / 150);
        std[2] = Math.sqrt(std[2] / 150);
        std[3] = Math.sqrt(std[3] / 150);

        System.out.println("Minimum : " + min[0] + "   " + min[1] + "   " + min[2] + "   " + min[3]);
        System.out.println("\nMaximum : " + max[0] + "   " + max[1] + "   " + max[2] + "   " + max[3]);
        System.out.println("\nAverage : " + avg[0] + "   " + avg[1] + "   " + avg[2] + "   " + avg[3]);
        System.out.println("\nStandard Deviation : " + std[0] + "   " + std[1] + "   " + std[2] + "   " + std[3]);
    }
}