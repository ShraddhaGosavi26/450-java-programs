import java.util.Scanner;

public class NumPower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,p,result=1;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        System.out.println("Enter the power for number: ");
        p=sc.nextInt();
        for(int i=0;i<p;i++){
            result=result*n;
        }
        System.out.println("Result is: "+result);
    }    
}
