class _19Fibonacci{
    public static void main(String[] args) {
        int a =0;
        int b= 1;
        //19--Fibonacci Series In Java Programs
        System.out.print(a + " "+ b);
        int c;
        for (int i = 1; i < 10; i++) {
            c = a+b;
            System.out.print("  " +c);
            a=b;
            b=c;


        }
    }
}