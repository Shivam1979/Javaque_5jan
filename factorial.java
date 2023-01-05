import java.util.Scanner;

public class factorial {
    // find factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial ");
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            if (n % i ==0){
                System.out.println(i);
            }

        }

    }
}
