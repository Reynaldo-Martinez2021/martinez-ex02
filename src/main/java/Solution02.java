import java.util.Scanner;

public class Solution02 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 02 Solution
     *  Copyright 2021 Reynaldo Martinez
     */
    /*
     * Ask user for an input string
     * Store the string in 'inputString'
     * Calculate 'inputString' with .length() method
     * Print the output with original string and length of string
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String inputString = scan.nextLine();
        int inputStringLength = inputString.length();
        System.out.printf("%s has %d characters.",inputString, inputStringLength);
    }
}
