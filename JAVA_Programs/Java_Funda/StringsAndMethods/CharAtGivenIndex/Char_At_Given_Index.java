package Question_2;

import java.util.Scanner;

public class Char_At_Given_Index {
    public static void main(String[] args) {
        Scanner new_Scanner= new Scanner(System.in);
        System.out.println("Enter the String");
        String string = new_Scanner.nextLine();
        System.out.println("Enter the character position you want to access");
        int position= new_Scanner.nextInt();
        System.out.print("Character at position"+" "+ position + " " + "is"+ " "+ string.charAt(position) );
        new_Scanner.close();
    }
}
