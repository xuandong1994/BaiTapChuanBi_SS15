

import java.util.Scanner;

public class BT1 {
    /**
     * Viết một chương trình Java để tính tổng của hai số nguyên nhập vào từ bàn phím.
     * Nếu người dùng nhập vào một giá trị không phải số nguyên,
     * chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
     * ***/
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            try {
                System.out.println("Mời nhập số thứ 1 :");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời nhập số thứ 2 : ");
                int number2 = Integer.parseInt(scanner.nextLine());
                int sum = number1+number2;
                System.out.println("Tổng 2 số là :" + sum);
                break;
            }catch (NumberFormatException e) {
                System.err.println("Nhâp không đúng ,Vui lòng nhập số nguyên");
            }
        }

    }
}
