import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float pr,rate,time,si;
        System.out.print("Principal: ");
        pr=sc.nextFloat();
        System.out.print("Rate of Intrest: ");
        rate=sc.nextFloat();
        System.out.print("Time: ");
        time=sc.nextFloat();

        si=(pr*rate*time)/100;
        System.out.println("Simple Intreset is : "+si);
        float amt=pr+si;
        System.out.println("Total Amount to return is: "+amt);
    }
}
