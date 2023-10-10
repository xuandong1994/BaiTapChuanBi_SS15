import java.util.Scanner;

public class BT7 {
    /***
     * Đề bài: Viết một chương trình Java để tìm số lớn nhất trong hai số nguyên được nhập vào từ bàn phím.
     * Nếu người dùng nhập vào một giá trị không phải số nguyên,
     * chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit){
            try{
                System.out.println("Mời nhập số nguyên thứ 1 :");
                int number1 = scanner.nextInt();
                System.out.println("Mời nhập số nguyên thứ 2 :");
                int number2 = scanner.nextInt();

                int max = Math.max(number1, number2);
                System.out.println("Số lớn nhất là: " + max);
                isExit = true;
            } catch (Exception e) {
                System.err.println("Lỗi: Vui lòng nhập số nguyên.");
            } finally {
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
