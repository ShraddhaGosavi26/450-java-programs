import java.util.Scanner;

public class AsciiChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c;
        System.out.println("Enter Character: ");
        c=s.next().charAt(0);
        System.out.println("ASCII Value of '"+c+"' is: "+(int)c);
    }
}
