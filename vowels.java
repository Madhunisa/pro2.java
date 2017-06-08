# pro2.java
import java.io.*;
import java.util.*;
public class vowels
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);     
    System.out.print("Enter a word: " );
    String str = sc.next(); 
    char[] myChar = str.toCharArray(); 
    for (char c : myChar) { 
        switch (c) {
            case 'a':     
            case 'A':     
            case 'e':     
            case 'E':     
            case 'i':     
            case 'I':     
            case 'o':     
            case 'O':     
            case 'u':     
            case 'U':    
                System.out.println(c + " - Vowel");
                break;
            default:
                System.out.println(c);
                break;
        }
    }
} 
	 


}

