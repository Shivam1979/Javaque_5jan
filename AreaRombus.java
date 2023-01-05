import java.util.Scanner;

public class AreaRombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of both doagonels");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int ans = (int) (d1 * (0.5) * d2);
                //To calculate the area of a rhombus, the following formula is used:

                      // A = ½ × d1 × d2
        System.out.println(ans);
    }
}
