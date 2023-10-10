import java.util.Scanner;

public class BT12 {
    /**
     * Đề bài: Viết một chương trình Java để tìm ước chung lớn nhất của hai số nguyên.
     * Nếu hai số đều bằng 0, chương trình sẽ hiển thị thông báo lỗi.

     * Hướng dẫn:
     * - Bước 1: Khai báo biến và nhập dữ liệu
     * Khai báo hai biến nguyên để lưu giá trị hai số.
     * Sử dụng Scanner để nhập hai số từ người dùng.

     * - Bước 2: Kiểm tra điều kiện cả hai số bằng 0
     * Kiểm tra nếu cả hai số đều bằng 0, hiển thị thông báo lỗi và kết thúc chương trình.

     * - Bước 3: Tìm ước chung lớn nhất (UCLN)
     * Sử dụng một hàm hoặc thuật toán để tính UCLN của hai số nguyên.
     * Có thể sử dụng thuật toán Euclid(giải thuật để tính ước chung lớn nhất của hai số nguyên) hoặc sử dụng các phép toán.

     * - Bước 4: Hiển thị kết quả
     * In ra UCLN của hai số nguyên.

     * - Bước 5: Kết thúc chương trình
     * Đóng Scanner và kết thúc chương trình.**/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check){
            try {
                System.out.println("Mời nhập số nguyên thứ 1 : ");
                int number1 = scanner.nextInt();
                System.out.println("Mời nhập số nguyên thứ 2 : ");
                int number2 = scanner.nextInt();
                if (number1 ==0 || number2 ==0){
                    System.err.println("2 số nguyên phải lớn hơn 0 ");
                     scanner.close();
                     return;
                }
                int UCLN = findGCD(number1,number2);
                System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + "là :" +UCLN);
                check =true;
            }catch (Exception e) {
                System.err.println("Lỗi vui lòng nhập lại ");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    public static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
