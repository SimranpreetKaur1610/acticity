package com.simran;

public class classActivity
{
    public static void main(String[] args)
    {
        String str = "hello hello how are you HELLO are there happy test you";
        String[] words = str.split(" ");  //use the split
        int wordCounts=1;    //Variable for getting Repeated word count

        //use outer for loop to compare
        for (int i = 0;i<words.length;i++)
        {
            //use inner for loop to compare
            for (int j =0; j<words.length;j++)
            {
                if(words[i].equals(words[j])) //checking if strings are equal
                {
                    wordCounts=wordCounts+1; //increase the value if the words are equal
                    words[j]="0";            //do not use the repeated words.
                }
            }
            System.out.println(words[i]);
        }
    }
}
