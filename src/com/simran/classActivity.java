package com.simran;

import java.util.Locale;

public class classActivity
{
    public static void main(String[] args)
    {
        String str = "hello hello how are you HELLO are there happy test you";
        str = str.toLowerCase();
        String[] words = str.split(" ");  //use the split
        int wordCounts=1;    //Variable for getting Repeated word count

        for (int i = 0;i<words.length;i++)//use outer for loop to compare
        {
            for (int j =i+1; j<words.length;j++) //use inner for loop to compare
            {
                if(words[i].equals(words[j])) //checking if strings are equal
                {
                    wordCounts=wordCounts+1; //increase the value if the words are equal
                    words[j]="0";            //do not use the repeated words.
                }
            }
            if(!words[i].equals("0"))
                System.out.println(words[i]+" -> "+wordCounts);
            wordCounts=1;

        }
    }
}
