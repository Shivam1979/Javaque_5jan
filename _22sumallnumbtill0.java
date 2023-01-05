import java.util.Scanner;

public class _22sumallnumbtill0 {
    //22--Take integer inputs till the user enters 0 and print the sum of all numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 0;
         while (a!=0){
             a = sc.nextInt();
              b= b+a;
             System.out.println("Enter number till press 0 , to find the sum");
             System.out.println( "  "+b);
         }

    }
}
