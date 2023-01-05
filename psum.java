public class psum {

    public static void main(String[]args){
        int sum = 0;
        int product = 1;
        int n=0;
        while(n!=0){
            int digit=n % 10;
            sum+=digit;
            product= product*digit;
            n=n/10;
        }
        int subtract = product - sum;
        System.out.println(subtract);

    }
}
