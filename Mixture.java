import java.io.*;
import java.util.*;
import java.lang.*;

public class Mixture {


    public static void main(String[] args) throws FileNotFoundException{
        
        int length=0;  

  String fileName = "solutions.txt";
  String output = "answer.txt";
  Scanner inFile = new Scanner(new File(fileName));
  PrintWriter outFile = new PrintWriter(output);
        
        String str = inFile.nextLine();
        String[] ar=str.split(":");
        length = ar.length;
        System.out.println(length);

        double[] right= new double[length];        
        for(int i=0; i < length; i++)
        {
            right[i] = Double.parseDouble(ar[i]);
        }

        double[][] left = new double [length][length];       
        for(int j=0; j < length; j++)
        {
            
            String str2 = "0"; 
            if(inFile.hasNext())
            str2= inFile.nextLine();
            String[] ar2=str2.split(":");
            
            for(int k=0; k < length; k++)
            {
                left[k][j] = Double.parseDouble(ar2[k]);
            }      
        } 

        int leftLength = left.length;
        double[] x = elimination(left, right, leftLength);
        
        for (int i = 0; i < length; i++) {
            
            outFile.printf("%.0f%n",x[i]);
        }

        inFile.close();
        outFile.close();
    }

//MAIN END ///////////////////////////////////////////////////////////////////////////////////////
    public static double[] elimination(double[][] left, double[] right, int length) 
    {
        
        int maximum=0;

        for (int x = 0; x < length; x++) 
        {
            maximum = x;
            for (int i = x+1; i < length; i++) 
            {
                if (left[i][x] > left[maximum][x]) 
                {
                    maximum = i;
                }
            }
            ////////////////////////////////////////////////////
            double temp2 = right[x];
            right[x] = right[maximum]; 
            right[maximum] = temp2;

            double[] temp = new double[length];
            temp = left[x];

             left[x] = left[maximum]; 
             left[maximum] = temp;
             double y =0;
            ////////////////////////////////////////////////////          
            for (int i = x + 1; i < length; i++) 
            {
                y = left[i][x] / left[x][x];

                right[i] = right[i] - (y * right[x]);

                for (int j = x; j < length; j++) 
                {
                    left[i][j] = left[i][j] - (y * left[x][j]);
                }
            }
        }   
        double[] solution = new double[length];
        double sum;
        for (int i = length -1 ; i >= 0; i--) 
        {
            sum = 0.0;

            for (int j = i + 1; j < length; j++) 
            {
                sum = sum +left[i][j] * solution[j];
            }
            solution[i] = (right[i] - sum) / left[i][i];
        }
        return solution;
   }
}
