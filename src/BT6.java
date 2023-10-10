import java.util.Scanner;

public class BT6 {
    /**
     * Viết một chương trình Java để thực hiện phép chia hai số nguyên và
     * xử lý ngoại lệ nếu người dùng nhập vào số chia bằng 0.
     ****/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            try {
                System.out.println("Mời nhập số chia: ");
                int soChia = scanner.nextInt();
                System.out.println("Mời nhập số bị chia: ");
                int soBiChia = scanner.nextInt();

                if (soBiChia == 0) {
                    throw new ArithmeticException("Số chia không được là 0");
                }

                int resutl = soChia / soBiChia;
                System.out.println("Kết quả: " + resutl);
                isExit = true;
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi");
            } finally {
                scanner.nextLine();

            }
        }
        scanner.close();
    }
}
