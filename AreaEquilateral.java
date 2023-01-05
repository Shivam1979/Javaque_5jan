import java.util.Scanner;

public class AreaEquilateral {
    public static void main(String[] args) {
        //16--Area Of Equilateral Triangle;
        //(A) = (√3/4)a2
        System.out.println("Enter the length of side ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double s = area(a);
        System.out.println(s);
    }

    static double area(int a) {
        double area = ((Math.sqrt(3) / 4) * a * a);
        return area;
    }
}
