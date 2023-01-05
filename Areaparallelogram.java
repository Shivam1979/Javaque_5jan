import java.util.Scanner;

public class Areaparallelogram {
    public static void main(String[] args) {
        //14--Area Of Parallelogram
        // And the Formula Of Area of  parallelogram is Area = base × height

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Base and Height");
        int base = sc.nextInt();
        int height = sc.nextInt();

        int area = base * height ; // The Formula Of Area of  parallelogram is Area = base × height
        System.out.println(area);
    }
}
