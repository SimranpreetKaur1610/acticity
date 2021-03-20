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
                if(words[i] == words[j])
                {
                    wordCounts=wordCounts+1;

                }
            }
        }
    }
}
