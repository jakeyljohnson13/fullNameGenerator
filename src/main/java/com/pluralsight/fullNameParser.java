package com.pluralsight;
import java.util.Scanner;

public class fullNameParser {
    static Scanner n = new Scanner(System.in);
    static String _fullname;
    static String first;
    static String middle;
    static String last;

    static int space1;
    static int space2;

    public static void nameParse(){
        System.out.println("Please enter your full name: ");
        _fullname = n.nextLine();
        space1 = _fullname.indexOf(" ");
        first = _fullname.substring(0,space1);
        space2 = _fullname.lastIndexOf(" ");
        last = _fullname.substring(space2 +1);
        if (space1 != space2){
            middle = _fullname.substring(space1 + 1,space2);
        }else {
            middle = "";
        }
        if (middle.length() > 0){
            System.out.println(first);
            System.out.println(middle);
            System.out.println(last);
        } else {
            System.out.println(first);
            System.out.println(last);
        }




    }


}
