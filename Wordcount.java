//lehlohonolo macheru                   28 september 2016           wordcount program

import java.util.*;
import java.io.*;

public class Wordcount
{
        public static void main(String[] args){
              Scanner input = new Scanner(System.in);

                String filename = null;
                BufferedReader reader = null;
                int wordCount = 0;
                int lineCount = 0;
                int charCount =0;

                //prompting the user to add his or her own file name
                System.out.println("Please enter the name of the file");
                filename = input.nextLine();
      

                 try{
                //       Creating BufferedReader object              
                         reader = new BufferedReader(new FileReader(filename));
                         String currentLine = reader.readLine();

                  while (currentLine != null)
                    {
                         lineCount++;
                         // Getting number of words in currentLine
                         // below the split will look for any word but excluding one or more white-space
                         String[] words = currentLine.split("\\s+");//Matches anything but white-space characters.
                         // Updating the wordCount
                         wordCount = wordCount + words.length;

                         for (String word : words)
                        {
                            //Updating the charCount
			charCount = charCount + word.length();
                        }

                        // Reading next line into currentLine
                        currentLine = reader.readLine();

                   }

                System.out.println("Number of char " +charCount);
                System.out.println("Number Of Words In A File : "+wordCount);
                System.out.println("Number Of Lines In A File : "+lineCount);
                }
                        catch(IOException e){
                        System.out.println("Error opening the file "+ filename);
                        System.exit(0);
                        }

                         finally{
                                try
                                     {
                                           reader.close();// Closing the reader
                                     }
                                        catch (IOException e)
                                     {
                                        System.out.println("Error please try again");
                                     }
                                }


        }

}
 

