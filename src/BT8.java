import java.util.Scanner;

public class BT8 {
    /**Đề bài: Viết một chương trình Java để kiểm tra xem một số có phải số nguyên tố hay không.
     * Nếu số không phải số nguyên,tố, chương trình sẽ hiển thị thông báo lỗi.
     * ***/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check){
            try{
                System.out.println("Mời nhập số : ");
                int number1 = scanner.nextInt();
                if (isPrime(number1)){
                    System.out.println( number1 + " Là số nguyên tố " );
                }else
                    System.err.println(number1 + " Không phải là số nguyên tố");
                check = true;
            }catch (Exception e) {
                System.err.println("Lỗi , vui lòng nhập số nguyên tố ");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
