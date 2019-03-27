import java.io.*;
import java.util.*;
public class Party2 {
  public static void main (String[]args) throws FileNotFoundException
   {   
      String fileName = "description.txt";
      String fileName2 = "text2.txt";
      String output = "party.txt";
      
      int k1=0;
      int k2=0;
      Scanner inFile = new Scanner(new File(fileName));
      PrintWriter outFile = new PrintWriter(output);
    
      k1 = inFile.nextInt();
      k2 = inFile.nextInt();
      k2++;
      String nothing = inFile.nextLine();

      ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(); //entire list
      ArrayList<Integer> invite = new ArrayList<Integer>(); //who gets invited

      int count = 0;
      while(inFile.hasNextLine()) //READ MATRIX INTO LIST
      {
           String line = inFile.nextLine();
           
           list.add(new ArrayList<Integer>()); //ADD ROW
           int size = line.length();

           for(int i=0; i < size; i++)
            {
               int number = Integer.parseInt(line.substring(i,i+1));
               list.get(count).add(number); //ADD NUMBERS TO ROW     
            }
           
           count++;
           invite.add(count);           
      }

       for(int iter=0; iter<list.size(); iter++) //REMOVE UNINVITABLES
       {
        int degree = 0;
        int sum = 0;
          for (int i: list.get(iter)) 
          {
            sum += i;//GET SUM OF ROW
          }

          if(k1 > sum || sum > (count-k2))
          {
            count--;
            for(int j=0; j < list.size();j++) //REMOVE COLUMN
            list.get(j).remove(iter);

            list.remove(iter); //REMOVE ROW
            invite.remove(iter); //REMOVE IDENTIFIER
            
            iter = -1;
          }
       }

      for(int k : invite)//PRINT INVITEES TO FILE
      {
        outFile.printf("%d%n",k);
      }
      inFile.close();
      outFile.close();
   }
}