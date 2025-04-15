package com.pluralsight;
import java.util.Scanner;

public class fullNameApplication {
    static Scanner s = new Scanner(System.in);
    static String firstName;
    static String middleName;
    static String lastName;
    static String suffix;
    static String fullName;
    //static char _first;

    public static void namePrompt(){
        System.out.println("Please Enter your first name: ");
        firstName = s.nextLine();
        firstName = firstName.trim();
        //_first = firstName.charAt(0);
        //_first = _first.toUppercase
        System.out.println("Please enter your middle name: ");
        middleName = s.nextLine();
        if (!middleName.isEmpty()){
            middleName = middleName.trim();
            middleName = " " + middleName;
        } else {
            middleName = "";
        }

        System.out.println("Please enter your last name: ");
        lastName = s.nextLine();
        if (!lastName.isEmpty()){
            lastName = lastName.trim();
            lastName = " " + lastName;
        }else {
            lastName = "";
        }

        System.out.println("Please enter your suffix if applicable: ");
        suffix = s.nextLine();
        if (!suffix.isEmpty()){
            suffix = suffix.trim();
            suffix = ", " + suffix;
        }

        System.out.println();
        fullName = firstName + middleName + lastName + suffix;
        fullName = fullName.trim();
        System.out.println("Your name is " + fullName);
    }
}
