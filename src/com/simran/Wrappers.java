package com.simran;

import java.util.Locale;

public class Wrappers {
    public static void main(String[] args)
    {
        String str = "Welcome to lambton college";
        System.out.println("lenght:"+str.length());

        str = str.concat(" Toronto");
        //str = str.toLowerCase();
        //str = str.toUpperCase();
        System.out.println(str);

        String findSring = "lambton";
        int indexOfFindString = str.indexOf(findSring);
        String lambton = str.substring(indexOfFindString, indexOfFindString + findSring.length());
        System.out.println(lambton);

        //Check the word "College" exists or not
        String wordToFind = "college";
        System.out.println(str.contains(wordToFind));
        System.out.println(str.indexOf(wordToFind));
        if(str.indexOf(wordToFind) >= 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
        buffer.append(str);
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
        buffer.reverse();
        System.out.println(buffer);

        System.out.println(buffer.replace("Toronto",", Toronto"));
    }
}
