package Q3;

public class Vowels_And_Consonant {
    void print_char(char Java){
        int i = Java;
        if(i>=65 && i<=90 || i>=97 && i<=122){
            if( i ==97 || i==101 || i==108 || i==111 || i==117 || i==65 || i==69 || i==73 || i==79 || i==85){
                System.out.println("Character Is Vowel");
            }else{
                System.out.println("Character Is Consonant");
            }
        }
        else {
            System.out.println("Invalid character");
        }
    }

    public static void main(String[] args) {
        Vowels_And_Consonant obj = new Vowels_And_Consonant();
        obj.print_char('A');
        obj.print_char('M');
        obj.print_char('#');
    }
}
