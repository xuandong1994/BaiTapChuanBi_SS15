import java.util.Scanner;

public class BT13 {
    /**
     * Đề bài: Viết một chương trình Java để đảo ngược một chuỗi.
     * Nếu chuỗi không hợp lệ (ví dụ như null hoặc rỗng), chương trình sẽ hiển thị thông báo lỗi.

     * Hướng dẫn:
     * - Bước 1: Khai báo biến và nhập dữ liệu
     * Khai báo biến để lưu chuỗi gốc và chuỗi đảo ngược.
     * Sử dụng Scanner để nhập chuỗi từ người dùng.
     *
     * - Bước 2: Kiểm tra điều kiện chuỗi rỗng hoặc null
     * Kiểm tra nếu chuỗi là rỗng ("") hoặc null, hiển thị thông báo lỗi và kết thúc chương trình.
     *
     * - Bước 3: Đảo ngược chuỗi
     * Sử dụng vòng lặp hoặc các phương thức có sẵn để đảo ngược chuỗi.
     * - Bước 4: Hiển thị kết quả
     * In ra chuỗi đảo ngược.
     *
     * - Bước 5: Kết thúc chương trình***/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Mời nhập chuỗi : ");
                String s = scanner.nextLine();
                if (s.isEmpty() || s == null) {
                    System.err.println("Chuỗi không đc rỗng và null ");
                    scanner.close();
                    return;
                }
                String string = daoNguocChuoi(s);
                System.out.println("Chuỗi đảo ngược là : " + string);
                check = true;
            } catch (Exception e) {
                System.err.println("Lỗi, vui lòng nhập lại");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    public static String daoNguocChuoi(String s){
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

}
