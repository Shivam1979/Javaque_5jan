import java.util.Scanner;

public class AreaIsosceles {
    public static void main(String[] args) {
        //A = ½ × b × h
        //13--Area Of Isosceles Triangle
        System.out.println("Enter the width and height of isoscles Triangle ");
        Scanner sc = new Scanner(System.in);
        int  width = sc.nextInt();
        int  height = sc.nextInt();
        int ans = width * height ;
        int form = ans * 1/2;
        System.out.println(form);



    }
}
