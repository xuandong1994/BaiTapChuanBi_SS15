import java.util.Scanner;

public class BT9 {
    /**
     * Đề bài: Viết một chương trình Java để tính số Fibonacci thứ n.
     * Nếu n không phải số nguyên dương, chương trình sẽ hiển thị thông báo lỗi
     * .***/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check){
           try{
               System.out.println("Mời nhập số : ");
               int n = scanner.nextInt();
               if (n <=0 ){
                   System.err.println("vui lòng nhập số nguyên dương ");
               }else {
                int result = calculateFibonacci(n);
                   System.out.println("Số Fibonacci thứ " + n + " là: " + result);
                   check = true;
               }

           }catch (Exception e){
               System.err.println("Lỗi, vui lòng nhập lại");
               scanner.nextLine();
           }
        }
        scanner.close();
    }
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibMinus2 = 0;
        int fibMinus1 = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = fibMinus2 + fibMinus1;
            fibMinus2 = fibMinus1;
            fibMinus1 = fib;
        }

        return fib;
    }
}
