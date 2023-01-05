import java.util.Scanner;

public class PeriCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int ans = (int)(2 * Math.PI  *r);
        System.out.println(ans);


    }
}
